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
package net.nortlam.samle.commons.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio "Maltron" Leal */
public class Parse implements Serializable {

    private static final Logger LOG = Logger.getLogger(Parse.class.getName());

    public static List<String> parse(String content, String startLooking, 
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
                    System.out.printf(">>> WORD:%s\n",word);
                    result.add(word);
                    shouldend = word.equals(endLooking);
                } else break;
            }
            
            if(shouldend) break;
            System.out.printf("Start:%d End:%d\n",start, end);
        }
        
        return result;
    }

}
