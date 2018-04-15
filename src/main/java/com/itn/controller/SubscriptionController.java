/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

import com.itn.modal.Subscription;
import com.itn.service.SubscriptionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author elwyn
 */
@Controller
public class SubscriptionController {
    
    @Autowired
    SubscriptionService subscriptionService;
    
    @RequestMapping(value = "/admin/subscription/add", method = RequestMethod.POST)
    public String addSubcriber(Model model, @RequestParam("subscriberName") String name, @RequestParam("subscriberEmail") String email) {
        Subscription subscription = new Subscription(name, email);
        int id = subscriptionService.insertSubscriber(subscription);
        if (id > 0) {
            return "redirect:/index";
        }
        return "errorPage";
    }
    
    @RequestMapping(value = "/admin/subscription/display",method = RequestMethod.GET)
    public String displaySubscription(Model model){
        
        List<Subscription> list = subscriptionService.displaySubscriber();
        model.addAttribute("SubscriptionDetails",list);
        
        return "displaySubscription";
    }
    
    @RequestMapping(value = "/admin/subscription/delete/{id}",method = RequestMethod.GET)
    public String deleteSubscription(@PathVariable("id") int id){
        Subscription subscription = subscriptionService.selectById(id);
        subscriptionService.deleteSubscriber(subscription);
        return "redirect:/admin/subscription/display";
    }
}
