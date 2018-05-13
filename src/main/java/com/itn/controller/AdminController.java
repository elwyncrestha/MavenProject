/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.service.ContactService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author elwyn
 */
@Controller
public class AdminController {

    @RequestMapping(value = {"/admin/home", "/admin/dashboard"}, method = RequestMethod.GET)
    public String adminMain() {
        return "adminHome";
    }

    @GetMapping(value = "/login/failure")
    public String displayError(Model model) {
        model.addAttribute("LoginFailed", "Login failed !!!");
        return "login";
    }

    @GetMapping(value = "/login")
    public String displayLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        model.addAttribute("LogoutSuccessful", "Logout successful !!!");
        return "login";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }
    
    @RequestMapping(value = "/admin/events", method = RequestMethod.GET)
    public String displayEvent(){
        return "events";
    }
}
