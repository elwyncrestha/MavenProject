/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.daoimpl;

import com.itn.dao.StudentDao;
import com.itn.modal.Student;
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
public class StudentDaoImpl implements StudentDao{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void insert(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Student> selectAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Student> list = session.createCriteria(Student.class).list();
        session.close();
        return list;
    }

    @Override
    public List<Student> selectById(int id) {
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       List<Student> list = session.createCriteria(Student.class).add(Restrictions.eq("id", id)).list();
       session.close();
       return list;
    }

    @Override
    public void update(Student student) {
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       session.update(student);
       session.getTransaction().commit();
       session.close();
    }

    @Override
    public void delete(Student student) {
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       session.delete(student);
       session.getTransaction().commit();
       session.close();
    }
    
}
