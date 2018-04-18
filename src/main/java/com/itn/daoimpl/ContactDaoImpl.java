/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.ContactDao;
import com.itn.modal.Contact;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elwyn
 */
@Repository
public class ContactDaoImpl implements ContactDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public void insert(Contact contact) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(contact);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Contact> display() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Contact> list = session.createCriteria(Contact.class).list();
        session.close();
        return list;
    }
    
}
