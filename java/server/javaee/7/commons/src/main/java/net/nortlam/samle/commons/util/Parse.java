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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mauricio "Maltron" Leal */
public class Parse implements Serializable {

    private static final Logger LOG = Logger.getLogger(Parse.class.getName());

    public static List<String> parse(String content, String filter, String[] remove) {
        List<String> result = new ArrayList<String>();
        Pattern pattern = Pattern.compile(filter);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            String word = matcher.group();
//            System.out.printf("### %s\n",word);
            
            if(remove != null && remove.length > 0)
                for(int i=0; i < remove.length; i++)
                    word = word.replaceAll(remove[i], "");

            result.add(word.trim());
        }
        
        return result;
    }

}
