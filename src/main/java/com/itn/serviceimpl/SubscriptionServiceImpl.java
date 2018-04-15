/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceimpl;

import com.itn.dao.SubscriptionDao;
import com.itn.modal.Subscription;
import com.itn.service.SubscriptionService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elwyn
 */
@Service
@Transactional
public class SubscriptionServiceImpl implements SubscriptionService{
    
    @Autowired
    SubscriptionDao subscriptionDao;
    
    @Override
    public int insertSubscriber(Subscription subscription) {
        int id = subscriptionDao.insert(subscription);
        return id;
    }

    @Override
    public List<Subscription> displaySubscriber() {
        return subscriptionDao.display();
    }
    
    @Override
    public Subscription selectById(int id) {
        return subscriptionDao.getById(id).get(0);
    }

    @Override
    public void deleteSubscriber(Subscription subscription) {
        subscriptionDao.delete(subscription);
    }
}
