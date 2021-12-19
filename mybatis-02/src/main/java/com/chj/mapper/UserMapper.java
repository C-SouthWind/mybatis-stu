package com.chj.mapper;

import com.chj.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author ：com.chj
 * @date ：Created in 2021/10/20 19:35
 * @params :  UserMapper
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
}
