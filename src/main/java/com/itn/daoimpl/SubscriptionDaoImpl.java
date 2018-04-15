/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.SubscriptionDao;
import com.itn.modal.Subscription;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elwyn
 */
@Repository
public class SubscriptionDaoImpl implements SubscriptionDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public int insert(Subscription subscription) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        int id = (int) session.save(subscription);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    @Override
    public List<Subscription> display() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Subscription> list = session.createCriteria(Subscription.class).list();
        session.close();
        return list;
    }

    @Override
    public List<Subscription> getById(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Subscription> list = session.createCriteria(Subscription.class).add(Restrictions.eq("id", id)).list();
        session.close();
        return list;
    }

    @Override
    public void delete(Subscription subscription) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(subscription);
        session.getTransaction().commit();
        session.close();
    }
}