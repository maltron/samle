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
import java.util.Objects;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mauricio "Maltron" Leal */
@Entity(name="Currency")
@Table(name="GENERAL_CURRENCY", schema = "GENERAL")
public class Currency implements Serializable {

    private static final Logger LOG = Logger.getLogger(Currency.class.getName());
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CURRENCY_ID")
    private long ID;
    
    public static final int LENGTH_NAME = 30;
    @Column(name="NAME", length = LENGTH_NAME, nullable = false, unique = true)
    private String name;
    
    public static final int LENGTH_SYMBOL=3;
    @Column(name="SYMBOL", columnDefinition = "CHAR(3)", length = LENGTH_SYMBOL, nullable = false, unique = true)
    private String symbol; // ISO-4217

    public Currency() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.symbol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Currency other = (Currency) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<Currency ID=\"").append(ID).append("\">");
        if(name != null)
            buffer.append("<Name>").append(name).append("</Name>");
        if(symbol != null)
            buffer.append("<Symbol>").append(symbol).append("</Symbol>");
        
        return buffer.toString();
    }

}
