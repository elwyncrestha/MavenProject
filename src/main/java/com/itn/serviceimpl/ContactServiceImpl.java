/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceimpl;

import com.itn.dao.ContactDao;
import com.itn.dao.CourseDao;
import com.itn.modal.Contact;
import com.itn.service.ContactService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elwyn
 */
@Service
@Transactional
public class ContactServiceImpl implements ContactService{

    @Autowired
    ContactDao contactDao;
    
    @Override
    public void insertContact(Contact contact) {
        contactDao.insert(contact);
    }

    @Override
    public List<Contact> displayContact() {
        return contactDao.display();
    }
    
}
