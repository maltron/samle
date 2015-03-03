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
package net.nortlam.samle.currency.tooling;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import net.nortlam.samle.commons.util.Parse;

//import net.nortlam.porcupine.common.ssl.SSL;
//import net.nortlam.porcupine.common.ssl.SSLIgnoreCertificate;
/**
 *
 * @author Mauricio "Maltron" Leal */
public class Import implements Serializable {

    private static final Logger LOG = Logger.getLogger(Import.class.getName());
    
    public static final String WEBSITE = "http://en.wikipedia.org/wiki/List_of_circulating_currencies";
    
    public static void main(String[] args) {
        Import app = new Import();
    }

    public Import() {

        ClientBuilder builder = ClientBuilder.newBuilder();
        Client client = builder.newClient();
        WebTarget target = client.target(WEBSITE);
        Response response = null;
        LOG.log(Level.INFO, ">>> Start Connection");
        try {
            response = target.request().get(); int start, end;
            if(response.getStatus() == Response.Status.OK.getStatusCode()) {
                String body = response.readEntity(String.class);
                List<String> result = Parse.parse(body, "<td(.*?)</td>", null);
                for(String value: result) System.out.printf(">>>: %s\n", value);
            }
            
        } finally {
            LOG.log(Level.INFO, ">>> Closing Connection");
            if(response != null) response.close();
            client.close();
        }
    }
}
