package com.nickforreal.springbootmall.service;

import com.nickforreal.springbootmall.dto.UserRegisterRequest;
import com.nickforreal.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
