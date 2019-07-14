package com.blog.service;

import com.blog.entity.User;
import com.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

    public User getUserByIndex(int index){
        return userMapper.getUserByIndex(index);
    }
}
