/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.service;

import com.itn.dao.UserDao;
import com.itn.modal.UserLogin;
import java.util.List;

/**
 *
 * @author elwyn
 */
public interface UserService {
    List<UserLogin> displayUserLogin();
}
