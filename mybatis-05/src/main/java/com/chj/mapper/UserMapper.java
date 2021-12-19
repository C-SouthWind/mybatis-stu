package com.chj.mapper;

import com.chj.pojo.User;
import org.apache.ibatis.annotations.Select;


import java.util.List;
import java.util.Map;

/**
 * @author ：com.chj
 * @date ：Created in 2021/10/20 19:35
 * @params :  UserMapper
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
}
