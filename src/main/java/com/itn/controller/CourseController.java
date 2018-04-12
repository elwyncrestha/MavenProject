/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.modal.Course;
import com.itn.service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author elwyn
 */
@Controller
public class CourseController {
    
    @Autowired
    CourseService courseService;
    
    @RequestMapping(value={"/admin/course/add","/admin/course/insert"},method=RequestMethod.GET)
    public String AddCourse(){
        return "addCourse";
    }
    
    @RequestMapping(value={"/admin/course/add","/admin/course/insert"},method=RequestMethod.POST)
    public String saveCourse(@RequestParam("cTitle") String title, 
            @RequestParam("cPrice") float price,
            @RequestParam("cDuration") String duration){
        System.out.println(title+" "+price+" "+duration);
        
        //save these fields into database
        //call service class to do dao operations using dao
        Course cm = new Course();
        cm.setTitle(title);
        cm.setPrice(price);
        cm.setDuration(duration);
        
        courseService.addCourse(cm);
        
        return "addCourse";
    }
    
    @RequestMapping(value="/admin/course/display",method=RequestMethod.GET)
    public String displayCourse(Model model){
        //fetch data from db
        List<Course> list = courseService.getAllCourses();
        model.addAttribute("CourseData",list);
        
        return "displayCourse";
    }
    
    @RequestMapping(value="/admin/course/edit/{id}",method=RequestMethod.GET)
    public String editCourse(@PathVariable("id") int id, Model model){
        Course course = courseService.getById(id);
        model.addAttribute("editDetails",course);
        return "editCourse";
    }
    
    @RequestMapping(value = {"/admin/course/update","/admin/course/edit"},method=RequestMethod.POST)
    public String updateCourse(@ModelAttribute("editDetails") Course course){
        courseService.updateCourse(course);
        return "redirect:/admin/course/display";
    }
    
    @RequestMapping(value = "/admin/course/delete/{id}",method = RequestMethod.GET)
    public String deleteCourse(@PathVariable("id") int id){
        Course course = courseService.getById(id);
        courseService.deleteCourse(course);
        return "redirect:/admin/course/display";
    }
}
