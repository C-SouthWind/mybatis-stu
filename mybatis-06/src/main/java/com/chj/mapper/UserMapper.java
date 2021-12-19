package com.chj.mapper;

import com.chj.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ：com.chj
 * @date ：Created in 2021/10/20 19:35
 * @params :  UserMapper
 */
public interface UserMapper {
    List<User> getUsers();
}
