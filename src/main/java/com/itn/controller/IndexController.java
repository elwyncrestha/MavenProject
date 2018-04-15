/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.modal.Course;
import com.itn.modal.Student;
import com.itn.modal.Subscription;
import com.itn.service.CourseService;
import com.itn.service.StudentService;
import com.itn.service.SubscriptionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author elwyn
 */
//All these controllers act as a module
@Controller
public class IndexController {

    @Autowired
    CourseService courseService;
    @Autowired
    StudentService studentService;

    @RequestMapping(value = {"/index","logout/root"}, method = RequestMethod.GET)
    public String home(Model model, Model model1) {
        List<Course> listCourse = courseService.getAllCourses();
        List<Student> listStudent = studentService.getAllStudent();

        model.addAttribute("CourseData", listCourse);
        model1.addAttribute("StudentDetails", listStudent);
        return "studentHome";
    }
}
