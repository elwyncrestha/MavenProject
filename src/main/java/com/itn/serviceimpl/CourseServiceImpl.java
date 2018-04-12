/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceimpl;

import com.itn.dao.CourseDao;
import com.itn.modal.Course;
import com.itn.service.CourseService;
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
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseDao courseDao;
    
    @Override
    public void addCourse(Course cm) {
        courseDao.insert(cm);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDao.selectAll();
    }

    @Override
    public Course getById(int id) {
       return courseDao.selectById(id);
    }

    @Override
    public void updateCourse(Course cm) {
        courseDao.update(cm);
    }

    @Override
    public void deleteCourse(Course course) {
        courseDao.delete(course);
    }
    
}
