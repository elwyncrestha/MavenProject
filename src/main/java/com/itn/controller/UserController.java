/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.modal.UserLogin;
import com.itn.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author elwyn
 */
@Controller
public class UserController {
    
    @Autowired
    UserService userService;
    
    @GetMapping(value = "/admin/user/display")
    public String displayUser(Model model){
        List<UserLogin> list = userService.displayUserLogin();
        model.addAttribute("UserDetails",list);
        
        return "displayUser";
    }
}
