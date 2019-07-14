package com.blog.mapper;

import com.blog.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> getAllUser();

    public User getUserByIndex(int index);
}
