package com.mouds.service;

import com.mouds.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("into service add ....");
        userDao.add();
    }

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
}
