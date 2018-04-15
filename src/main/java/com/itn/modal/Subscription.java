/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.modal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author elwyn
 */
@Entity
@Table(name = "subscription_tbl")
public class Subscription implements Serializable{
    private static final long serialVersionUID = 3L;    //class value while serializing
    
    @Column(name = "subscriberId")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subscriberId;
    @Column(name = "subscriberFullName")
    private String subscriberFullName;
    @Column(name = "subscriberEmail")
    private String subscriberEmail;

    public Subscription() {
    }

    public Subscription(int subscriberId, String subscriberFullName, String subscriberEmail) {
        this.subscriberId = subscriberId;
        this.subscriberFullName = subscriberFullName;
        this.subscriberEmail = subscriberEmail;
    }

    public Subscription(String subscriberFullName, String subscriberEmail) {
        this.subscriberFullName = subscriberFullName;
        this.subscriberEmail = subscriberEmail;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberFullName() {
        return subscriberFullName;
    }

    public void setSubscriberFullName(String subscriberFullName) {
        this.subscriberFullName = subscriberFullName;
    }

    public String getSubscriberEmail() {
        return subscriberEmail;
    }

    public void setSubscriberEmail(String subscriberEmail) {
        this.subscriberEmail = subscriberEmail;
    }
    
    
}
