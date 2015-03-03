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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import net.nortlam.porcupine.common.ssl.SSL;
import net.nortlam.porcupine.common.ssl.SSLIgnoreCertificate;
/**
 *
 * @author Mauricio "Maltron" Leal */
public class Import implements Serializable {

    private static final Logger LOG = Logger.getLogger(Import.class.getName());
    
    public static final String WEBSITE = "https://www.countries-ofthe-world.com/world-currencies.html";
    public static final String START = "<td colspan=\"3\"><a class=\"letter\">A</a></td>";
    
    public static void main(String[] args) {
        Import app = new Import();
    }

    public Import() {

        ClientBuilder builder = ClientBuilder.newBuilder();
        SSL ssl = new SSLIgnoreCertificate();
        Client client = builder.sslContext(ssl.createContext()).build();
        WebTarget target = client.target(WEBSITE);
        Response response = null;
        LOG.log(Level.INFO, ">>> Start Connection");
        try {
            response = target.request().get(); int start, end;
            if(response.getStatus() == Response.Status.OK.getStatusCode()) {
                String body = response.readEntity(String.class);
//                System.out.printf("BODY: %s\n",body);
                
                List<String> result = parse(body, START, "ZWD", new String[][] {
                    {"<td>", "</td>"}, {"<td>", "</td>"}, {"<tt>", "</tt>"}
                });
                for(String value: result)
                    System.out.printf(">>> %s\n",value);
                
//                // PARSE PARSE PARSE PARSE PARSE PARSE PARSE PARSE PARSE PARSE 
//                start = body.indexOf(START);
//                while(start > 0) {
//                    
//                    start = body.indexOf("<td>", start)+"<td>".length(); if(start < 0) break;
//                    end = body.indexOf("</td>", start); if(end < 0) break;
//                    String country = body.substring(start, end);
//                    
//                    start = body.indexOf("<td>", start)+"<td>".length(); if(start < 0) break;
//                    end = body.indexOf("</td>", start); if(end < 0) break;
//                    String currency = body.substring(start, end);
//                    
//                    
//                    start = body.indexOf("<tt>", start)+"<tt>".length(); if(start < 0) break;
//                    end = body.indexOf("</tt>", start); if(end < 0) break;
//                    String symbol = body.substring(start, end);
//                    
//                    System.out.printf("Country:%s Currency:%s Symbol:%s\n", country, currency, symbol);
//                    
//                    if(symbol.equals("ZWD")) break;
//                }
            }
            
        } finally {
            LOG.log(Level.INFO, ">>> Closing Connection");
            if(response != null) response.close();
            client.close();
        }
    }
    
    
    public List<String> parse(String content, String startLooking, 
                                        String endLooking, String[][] limits) {
        int start = content.indexOf(startLooking); int end = 0;
        List<String> result = new ArrayList<String>();
        while(start > 0) {
            boolean found = false; boolean shouldend = false;
            for(int i=0; i < limits.length; i++) {
                start = content.indexOf(limits[i][0], start)+limits[i][0].length();
                end = content.indexOf(limits[i][1], start);
                found = (start > 0) && (end > 0);
                
                if(found) {
                    String word = content.substring(start, end);
                    result.add(word);
                    shouldend = word.equals(endLooking);
                } else break;
            }
            
            if(shouldend) break;
        }
        
        return result;
    }
}
