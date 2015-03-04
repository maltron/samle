/*
 * 
 * Copyright 2014 Mauricio "Maltron" Leal <maltron@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package net.nortlam.samle.location;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import net.nortlam.samle.commons.entity.location.Country;
import net.nortlam.samle.commons.util.Parse;

/**
 *
 * @author Mauricio "Maltron" Leal */
public class ImportCountries implements Serializable {

    private static final Logger LOG = Logger.getLogger(ImportCountries.class.getName());
    
    public static final String WEBSITE = "http://en.wikipedia.org/wiki/ISO_3166-1";
    
    public static void main(String[] args) {
        ImportCountries app = new ImportCountries();
    }

    public ImportCountries() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("GENERAL_PU");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(WEBSITE);
        Response response = null;
        try {
            LOG.log(Level.INFO, ">>> Fetching Data from {0}", WEBSITE);
            response = target.request().get();
            if(response.getStatus() == Response.Status.OK.getStatusCode()) {
                List<String> words = Parse.parse(response.readEntity(String.class), 
                        "<td(.*?)</td>", 
                        new String[] {"<td>", "</td>", "<a(.*?)\\\">", "</a>", "<span(.*?)>", "</span>"});
                int column = 0;
                String name = null, code2 = null, code3 = null, numeric = null, iso = null;
                for(String word: words) {
                    if(word.equals("ISO 3166-2:ZW")) break;
                    
                    switch(column) {
                        case 0: name = word; break;
                        case 1: code2 = word; break;
                        case 2: code3 = word; break;
                        case 3: numeric = word; break;
                        case 4: iso = word; break;
                    }
                    
                    if(column == 4) {
                        column = 0;
                        System.out.printf("Name:%s Code2:%s Code3:%s ID:%s ISO:%s\n",
                                name, code2, code3, numeric, iso);
                        // ISO is not used
                        try {
                            transaction.begin();
                            long ID = Long.parseLong(numeric);
                            Country country = entityManager.find(Country.class, ID);
                            if(country == null) {
                                System.out.printf("<INSERTING> Name:%s Code2:%s Code3:%s ID:%s\n",
                                        name, code2, code3, numeric);
                                entityManager.persist(new Country(ID, name, code2, code3));
                            } else {
                                country.setName(name);
                                country.setCode2(code2);
                                country.setCode3(code3);
                                
                                System.out.printf("<UPDATING> Name:%s Code2:%s Code3:%s ID:%s\n",
                                        name, code2, code3, numeric);
                                entityManager.merge(country);
                            }
                            transaction.commit();
                            
                        } catch(NumberFormatException ex) {
                            LOG.log(Level.SEVERE, "### Unable to UPDATE Country:{0}", numeric);
                        } 
                        
                    } else column++;
                    
                }
                
            }
            
        } finally {
            LOG.log(Level.INFO, ">>> Closing Connection");
            
            if(response != null) response.close();
            client.close();
            
            if(entityManager != null) entityManager.close();
            if(factory != null) factory.close();
        }
    }

}
