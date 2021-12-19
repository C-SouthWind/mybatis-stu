package com;


import com.chj.mapper.UserMapper;
import com.chj.pojo.User;
import com.chj.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：com.chj
 * @date ：Created in 2021/10/26 19:24
 * @params :  test
 */
public class UserTest {

    @Test
    public void getUsers(){
        SqlSession session = MybatisUtils.getSession();
        //底层主要应用反射
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        System.out.println(users);
        session.close();
    }
}
