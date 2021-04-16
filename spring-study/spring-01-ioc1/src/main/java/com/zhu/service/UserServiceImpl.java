package com.zhu.service;

import com.zhu.dao.UserDao;
import com.zhu.dao.UserDaoImpl;
import com.zhu.dao.UserDaoMysqlImpl;
import com.zhu.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{

    /*
    古いコード
    賢くない
    private UserDao userDao = new UserDaoOracleImpl();
    */
    // setを利用する
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }


}
