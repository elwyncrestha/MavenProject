/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.serviceimpl;

import com.itn.dao.UserDao;
import com.itn.modal.UserLogin;
import com.itn.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author elwyn
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;
    
    @Override
    public List<UserLogin> displayUserLogin() {
        return userDao.display();
    }
    
}
