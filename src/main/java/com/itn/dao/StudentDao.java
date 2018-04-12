/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.dao;

import com.itn.modal.Student;
import java.util.List;

/**
 *
 * @author elwyn
 */
public interface StudentDao {
    
    void insert(Student student);
    
    List<Student> selectAll();
    
    List<Student> selectById(int id);
    
//    List<Student> selectByName(String name);
    
    void update(Student student);
    
    void delete(Student student);
}
