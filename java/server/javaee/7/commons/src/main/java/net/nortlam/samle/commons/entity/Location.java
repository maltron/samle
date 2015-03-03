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
package net.nortlam.samle.commons.entity;

import java.io.Serializable;
import java.util.logging.Logger;
import net.nortlam.samle.commons.entity.location.City;
/**
 *
 * @author Mauricio "Maltron" Leal */
public class Location implements Serializable {

    private static final Logger LOG = Logger.getLogger(Location.class.getName());
    
    private long ID;
    private String address1;
    private String address2;
    private String zipCode;
    private City city;

    public Location() {
    }

}
