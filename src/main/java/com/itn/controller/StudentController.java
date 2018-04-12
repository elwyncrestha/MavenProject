/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.modal.Student;
import com.itn.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author elwyn
 */
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = {"/admin/student/add", "/admin/student/insert"}, method = RequestMethod.GET)
    public String addStudent() {
        return "addStudent";
    }

    @RequestMapping(value = {"/admin/student/add", "/admin/student/insert"}, method = RequestMethod.POST)
//    public String saveStudent(@RequestParam("sFName") String fName, @RequestParam("sLName") String lName,
//            @RequestParam("sCountry") String sCountry, @RequestParam("sGender") String sGender,
//            @RequestParam("sHobby") String sHobby) {

//        Student student = new Student(fName, lName, sCountry, sGender, sHobby);

        public String saveStudent(@ModelAttribute("StudentDetails") Student student, Model model){
            
        model.addAttribute("StudentDetails",studentService.addStudent(student));
        
        return "displayStudent";
    }
        
    @RequestMapping(value = "/admin/student/display",method = RequestMethod.GET)
    public String displayStudent(Model model){
        List<Student> list = studentService.getAllStudent();
        model.addAttribute("StudentDetails",list);
        return "displayStudent";
    }
    
    @RequestMapping(value = "/admin/student/edit/{id}", method = RequestMethod.GET)
    public String editStudent(@PathVariable("id") int id, Model model){
        List<Student> list = studentService.getStudentById(id);
        model.addAttribute("EditStudentDetails",list);
        
        return "editStudent";
    }
    
    @RequestMapping(value = {"/admin/student/edit","/admin/student/update"},method = RequestMethod.POST)
    public String updateStudent(@ModelAttribute("editStudentDetails") Student student, Model model){
        List<Student> list = studentService.updateStudent(student);
        model.addAttribute("StudentDetails",list);
        return "displayStudent";
    }
    
    @RequestMapping(value = "/admin/student/delete/{id}", method = RequestMethod.GET)
    public String deleteStudent(Model model, @PathVariable("id") int id){
        Student student = studentService.getStudentById(id).get(0);
        model.addAttribute("StudentDetails", studentService.deleteStudent(student));
        return "displayStudent";
    }
}
