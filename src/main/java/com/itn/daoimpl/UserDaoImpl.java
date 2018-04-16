/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.UserDao;
import com.itn.modal.UserLogin;
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
public class UserDaoImpl implements UserDao{
    
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public List<UserLogin> display(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<UserLogin> list = session.createCriteria(UserLogin.class).list();
        session.close();
        return list;
    }
}
