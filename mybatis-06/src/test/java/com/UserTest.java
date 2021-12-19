package com;


import com.chj.mapper.UserMapper;
import com.chj.pojo.User;
import com.chj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

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

        session.clearCache();//手动清理缓存

        List<User> users2 = mapper.getUsers();
        System.out.println(users2);

        System.out.println(users==users2);
        session.close();
    }
}
