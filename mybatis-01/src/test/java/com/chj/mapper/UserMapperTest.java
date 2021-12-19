package com.chj.mapper;

import com.chj.pojo.User;
import com.chj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：com.chj
 * @date ：Created in 2021/10/20 19:47
 * @params :  user测试类
 */
public class UserMapperTest {

    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSession();
        //执行SQL

        //方式一：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        session.close();
    }

    @Test
    public void addUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.addUser(new User(6,"ww","1234"));
        session.commit();
        session.close();
    }

    @Test
    public void updateUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateUser(new User(6,"zz","567"));
        session.commit();
        session.close();
    }

    @Test
    public void deleteUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser(6);
        session.commit();
        session.close();
    }


    @Test
    public void addUser2(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",6);
        map.put("name","ww");
        map.put("pwd","123456");
        mapper.addUser2(map);

        session.commit();
        session.close();
    }

    @Test
    public void getUserLike(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> l = mapper.getUserLike("%l%");
        for (User user : l) {
            System.out.println(user);
        }

        session.close();
    }
}
