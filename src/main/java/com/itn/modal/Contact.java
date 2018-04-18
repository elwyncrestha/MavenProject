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
@Table(name = "contact_tbl")
public class Contact implements Serializable{
    private static final long serialVersionUID = 3L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "messagerId")
    private int id;
    
    @Column(name = "messagerName")
    private String name;
    
    @Column(name = "messagerEmail")
    private String email;
    
    @Column(name = "messagerWebsite")
    private String website;
    
    @Column(name = "messagerMessage")
    private String message;

    public Contact() {
    }

    public Contact(int id, String name, String email, String website, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.website = website;
        this.message = message;
    }

    public Contact(String name, String email, String website, String message) {
        this.name = name;
        this.email = email;
        this.website = website;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
