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

    //模糊查询
    List<User> getUserLike(String name);

    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);


    //inser一个用户
    int addUser(User user);

    //万能的Map
    int addUser2(Map<String,Object> map);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);
}
