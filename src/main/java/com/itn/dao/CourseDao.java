/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.dao;

import com.itn.modal.Course;
import java.util.List;

/**
 *
 * @author elwyn
 */
public interface CourseDao {
    
    void insert(Course cm);
    
    List<Course> selectAll();
    
    Course selectById(int id);
    
    void update(Course cm);
    
    void delete(Course course);
}
