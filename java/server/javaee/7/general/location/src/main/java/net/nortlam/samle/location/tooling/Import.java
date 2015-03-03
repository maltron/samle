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
package net.nortlam.samle.location.tooling;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mauricio "Maltron" Leal */
public class Import implements Serializable {

    private static final Logger LOG = Logger.getLogger(Import.class.getName());
    
    public static final String WEBSITE = "http://en.wikipedia.org/wiki/ISO_3166-1";
    
    public static final String TESTING = "<table class=\"wikitable sortable\">\n" +
"<tr>\n" +
"<th scope=\"col\">English short name (upper/lower case)</th>\n" +
"<th scope=\"col\"><a href=\"/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements\" title=\"ISO 3166-1 alpha-2\">Alpha-2 code</a></th>\n" +
"<th scope=\"col\"><a href=\"/wiki/ISO_3166-1_alpha-3#Officially_assigned_code_elements\" title=\"ISO 3166-1 alpha-3\">Alpha-3 code</a></th>\n" +
"<th scope=\"col\"><a href=\"/wiki/ISO_3166-1_numeric#Officially_assigned_code_elements\" title=\"ISO 3166-1 numeric\">Numeric code</a></th>\n" +
"<th scope=\"col\"><a href=\"/wiki/ISO_3166-2\" title=\"ISO 3166-2\">ISO 3166-2</a> codes</th>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Afghanistan\" title=\"Afghanistan\">Afghanistan</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AF\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AF</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">AFG</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">004</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AF\" title=\"ISO 3166-2:AF\">ISO 3166-2:AF</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><span style=\"display:none;\" class=\"sortkey\">Aland Islands !</span><span class=\"sorttext\"><a href=\"/wiki/%C3%85land_Islands\" title=\"Åland Islands\">Åland Islands</a></span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AX\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AX</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ALA</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">248</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AX\" title=\"ISO 3166-2:AX\">ISO 3166-2:AX</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Albania\" title=\"Albania\">Albania</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AL\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AL</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ALB</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">008</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AL\" title=\"ISO 3166-2:AL\">ISO 3166-2:AL</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Algeria\" title=\"Algeria\">Algeria</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#DZ\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">DZ</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">DZA</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">012</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:DZ\" title=\"ISO 3166-2:DZ\">ISO 3166-2:DZ</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/American_Samoa\" title=\"American Samoa\">American Samoa</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AS\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AS</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ASM</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">016</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AS\" title=\"ISO 3166-2:AS\">ISO 3166-2:AS</a></td>\n" +
"</tr></table>";
    
    public static void main(String[] args) {
        Import app = new Import();
    }

    public Import() {
                
        
                String startLooking = "<th scope=\"col\"><a href=\"/wiki/ISO_3166-2\" title=\"ISO 3166-2\">ISO 3166-2</a> codes</th>";
                String endLooking = "716";
                
//                int test = TESTING.indexOf(startLooking);
//                System.out.printf("Test:%d\n", test);
//                test = TESTING.indexOf(">\"", test);
//                System.out.printf("Test%d\n",test);
                
                String[][] limits = {{"<td>","</td>"},{"<td>","</td>"},
                    {"<td>", "</td>"}, {"<td>","</td>"}, {"<td>","</td>"}
                };
                
                int column = 0;
                for(String value: parse(TESTING, startLooking, endLooking, limits)) {
                    String endresult = null;
                    switch(column) {
                        case 0: endresult = crop(value, "\">", "</a>"); break;
                        case 1: endresult = crop(value, "font-family: monospace, monospace;\">", "</span>"); break;
                        case 2: endresult = crop(value, "\">", "</span>"); break;
                        case 3: endresult = crop(value, "\">", "</span>"); break;
                        case 4: endresult = crop(value, "\">", "</a>"); break;
                    }
                    
                    column++; 
                    if(column > 4) column = 0;
                    
                    String status = endresult != null ? "OK" : "ERROR";
                    System.out.printf("[%s] Original:%s\n", status, value);
                    System.out.printf("     Result:%s\n", endresult);
                    
                }
                
                System.out.printf("*** END OF LINE\n");
        
        
        
        
        
//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target(WEBSITE);
//        Response response = null;
//        try {
//            response = target.request().get();
//            if(response.getStatus() == Response.Status.OK.getStatusCode()) {
//                LOG.log(Level.INFO, ">>> Processing Content");
//                String body = response.readEntity(String.class);
//                System.out.printf("%s\n",body);
//                
////                String startLooking = "<th scope=\"col\"><a href=\"/wiki/ISO_3166-2\" title=\"ISO 3166-2\">ISO 3166-2</a> codes</th>";
////                String endLooking = "716";
////                
////                String[][] limits = {{"<td>","</td>"},{"<span>","</span>"},
////                    {"<td>", "</td>"}, {"<td>","</td>"}, {"<td>","</td>"}
////                };
////                
////                for(String value: Parse.parse(body, startLooking, endLooking, limits))
////                    System.out.printf(">>> %s\n", value);
//                
//                System.out.printf("*** END OF LINE\n");
//            }
//            
//            
//        } finally {
//            if(response != null) response.close();
//            client.close();
//        }
    }

    public static List<String> parse(String content, String startLooking, 
                                        String endLooking, String[][] limits) {
        int start = content.indexOf(startLooking)+startLooking.length(); 
        int end = 0;
//        System.out.printf(">>> (BEGIN) Start:%d END:%d\n", start, end);
        List<String> result = new ArrayList<String>();
        while(start > 0) {
            boolean found = false; boolean shouldend = false;
            for(int i=0; i < limits.length; i++) {
//                System.out.printf(">>> (DURING) #1 Start(%s):%d End:(%s):%d\n", limits[i][0], start, limits[i][1], end);
                start = content.indexOf(limits[i][0], start); 
//                System.out.printf(">>> (DURING) #2 Start(%s):%d End:(%s):%d\n", limits[i][0], start, limits[i][1], end);
                if(start < 0) shouldend = true;
                else start += limits[i][0].length();
                
                end = start > 0 ? content.indexOf(limits[i][1], start) : -1;
//               System.out.printf(">>> (DURING) #3 Start(%s):%d End:(%s):%d\n", limits[i][0], start, limits[i][1], end);
               
                found = (start > 0) && (end > 0);
                
                if(found) {
                    String word = content.substring(start, end);
//                    System.out.printf(">>> WORD:%s\n",word);
                    result.add(word);
                    shouldend = word.equals(endLooking);
                } else break;
                
                start = end;
            }
            
            if(shouldend) break;
//            System.out.printf("Start:%d End:%d\n",start, end);
        }
        
        return result;
    }
    
    
    public static String crop(String content, String begin, String finish) {
        int start = content.indexOf(begin);
        if(start < 0) {
            LOG.log(Level.WARNING, "### Unable to Locate BEGIN:\"{0}\" on {1}", 
                    new Object[] {begin, content});
            return null;
        }
        int end = finish != null ? content.indexOf(finish, start) : content.length();
        if(end < 0) {
            LOG.log(Level.WARNING, "### Unable to Locate END:\"{0}\" on {1}", 
                    new Object[] {begin, content});
            return null;
        }
        
        return content.substring(start+begin.length(),end);
    }
}
