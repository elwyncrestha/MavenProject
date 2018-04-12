/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.service;

import com.itn.modal.Course;
import java.util.List;

/**
 *
 * @author elwyn
 */
public interface CourseService {
    
    void addCourse(Course cm);
    
    List<Course> getAllCourses();
    
    Course getById(int id);
    
    void updateCourse(Course cm);
    
    void deleteCourse(Course course);
}
