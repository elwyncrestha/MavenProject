/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.modal.Contact;
import com.itn.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author elwyn
 */
@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping(value = "/message/add")
    public String addContact(@RequestParam("name") String name, @RequestParam("email") String email,
            @RequestParam("website") String website, @RequestParam("message") String message) {
        Contact contact = new Contact(name, email, website, message);
        contactService.insertContact(contact);
        return "redirect:/index";
    }

    @RequestMapping(value = "/admin/message/display", method = RequestMethod.GET)
    public String displayMessage(Model model){
        model.addAttribute("ContactDetails",contactService.displayContact());
        return "displayContactMessage";
    }

}
