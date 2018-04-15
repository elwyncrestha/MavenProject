/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.service;

import com.itn.modal.Subscription;
import java.util.List;

/**
 *
 * @author elwyn
 */
public interface SubscriptionService {
    
    int insertSubscriber(Subscription subscription);
    
    List<Subscription> displaySubscriber();
    
    Subscription selectById(int id);
    
    void deleteSubscriber(Subscription subscription);
}
