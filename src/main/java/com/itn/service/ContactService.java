/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.service;

import com.itn.modal.Contact;
import java.util.List;

/**
 *
 * @author elwyn
 */
public interface ContactService {
    void insertContact(Contact contact);
    
    List<Contact> displayContact();
}
