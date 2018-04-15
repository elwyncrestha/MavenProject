/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.dao;

import com.itn.modal.Subscription;
import java.util.List;

/**
 *
 * @author elwyn
 */
public interface SubscriptionDao {
    int insert(Subscription subscription);
    
    List<Subscription> display();
    
    List<Subscription> getById(int id);
    
    void delete(Subscription subscription);
}
