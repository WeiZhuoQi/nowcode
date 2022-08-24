package com.nowcode.community.dao;


import com.nowcode.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 魏卓其
 * @create 2022-08-21 9:53
 */
@Mapper
public interface UserMapper {
    User selectById(int id);
    User selectByName(String username);
    User selectByEmain(String email);
    int insertUser(User user);
    int updateStatus(int id,int status);
    int updateHeader(int id,String headerUrl);
    int updatePassword(int id,String password);

}
