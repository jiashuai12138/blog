package com.js.service;

import com.js.pojo.User;


public interface UserService {

    User checkUser(String username, String password);
}
