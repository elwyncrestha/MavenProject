/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceimpl;

import com.itn.dao.StudentDao;
import com.itn.modal.Student;
import com.itn.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author elwyn
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
    
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> addStudent(Student student) {
        studentDao.insert(student);
        return studentDao.selectAll();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDao.selectAll();
    }

    @Override
    public List<Student> getStudentById(int id) {
        return studentDao.selectById(id);
    }

    @Override
    public List<Student> updateStudent(Student student) {
        studentDao.update(student);
        return studentDao.selectAll();
    }

    @Override
    public List<Student> deleteStudent(Student student) {
        studentDao.delete(student);
        return studentDao.selectAll();
    }
    
}
