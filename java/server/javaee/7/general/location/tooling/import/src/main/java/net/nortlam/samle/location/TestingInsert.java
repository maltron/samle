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
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import net.nortlam.samle.commons.entity.location.Country;

/**
 *
 * @author Mauricio "Maltron" Leal */
public class TestingInsert implements Serializable {

    private static final Logger LOG = Logger.getLogger(TestingInsert.class.getName());
    
    public static void main(String[] args) {
        new TestingInsert();
    }

    public TestingInsert() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("GENERAL_PU");
        EntityManager entityManager = factory.createEntityManager();
        try {
            entityManager.persist(new Country(1, "HELLO", "2", "3"));
            
        } finally {
            if(entityManager != null) entityManager.close();
            if(factory != null) factory.close();
        }
        
    }

}
