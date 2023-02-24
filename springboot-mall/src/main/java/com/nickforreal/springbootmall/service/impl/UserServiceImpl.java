package com.nickforreal.springbootmall.service.impl;

import com.nickforreal.springbootmall.dao.UserDao;
import com.nickforreal.springbootmall.dto.UserRegisterRequest;
import com.nickforreal.springbootmall.model.User;
import com.nickforreal.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
