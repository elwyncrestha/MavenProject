/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.CourseDao;
import com.itn.modal.Course;
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
public class CourseDaoImpl implements CourseDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public void insert(Course cm) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cm);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Course> selectAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Course> list = session.createCriteria(Course.class).list();
        session.close();
        return list;
    }

    @Override
    public Course selectById(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Course> list = session.createCriteria(Course.class).add(Restrictions.eq("id", id)).list();
        session.close();
        return list.get(0);
    }

    @Override
    public void update(Course cm) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(cm);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Course course) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(course);
        session.getTransaction().commit();
        session.close();
    }
    
}
