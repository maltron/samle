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
import java.util.Calendar;
import java.util.Collection;
import java.util.TimeZone;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Mauricio "Maltron" Leal */
@Entity(name="Samle")
@Table(name="SAMLE_EVENT", uniqueConstraints = 
        @UniqueConstraint(columnNames = {"NAME", "EDITION"}))
public class Event implements Serializable {

    private static final Logger LOG = Logger.getLogger(Event.class.getName());

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EVENT_ID")
    private long ID;
    
    public static final int LENGTH_NAME = 45;
    @Column(name="NAME", length = LENGTH_NAME, nullable = false)
    private String name;
    
    @Column(name="EDITION", nullable = false)
    private int edition;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="STARTS", nullable = false)
    private Calendar starts;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENDS", nullable = false)
    private Calendar ends;
    
    private TimeZone timezone;
    
    private Collection<Ticket> tickets;
    
    private Collection<User> attendees;
    
    private Collection<User> speakers;
    
    private boolean isOnline;
    
    public Event() {
    }

}
