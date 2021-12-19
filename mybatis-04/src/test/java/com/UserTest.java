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

    static Logger logger= Logger.getLogger(UserTest.class);
    @Test
    public void getUserList(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        logger.info(user);
        session.close();
    }

    @Test
    public void  getUserByLimit(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }

        session.close();
    }


    @Test
    public void getUserByRowBounds(){
        SqlSession session = MybatisUtils.getSession();
        RowBounds rowBounds = new RowBounds(1, 2);
        List<User> users = session.selectList("com.chj.mapper.UserMapper.getUserByRowBounds",null,rowBounds);

        System.out.println(users);
        session.close();
    }
}
