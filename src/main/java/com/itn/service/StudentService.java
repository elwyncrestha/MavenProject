/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.service;

import com.itn.modal.Student;
import java.util.List;

/**
 *
 * @author elwyn
 */
public interface StudentService {
    
    List<Student> addStudent(Student student);
    
    List<Student> getAllStudent();
    
    List<Student> getStudentById(int id);
    
    List<Student> updateStudent(Student student);
    
    List<Student> deleteStudent(Student student);
}
