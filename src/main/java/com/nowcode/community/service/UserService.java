package com.nowcode.community.service;

import com.nowcode.community.dao.UserMapper;
import com.nowcode.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 魏卓其
 * @create 2022-08-22 10:52
 */
@Service
public class UserService {
    //根据userId查到user
    @Autowired
    private UserMapper userMapper;
    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
