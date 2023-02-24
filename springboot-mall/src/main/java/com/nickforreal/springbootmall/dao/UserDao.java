package com.nickforreal.springbootmall.dao;

import com.nickforreal.springbootmall.dto.UserRegisterRequest;
import com.nickforreal.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
