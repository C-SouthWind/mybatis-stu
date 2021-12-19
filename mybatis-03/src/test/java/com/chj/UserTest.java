package com.chj;

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
    public void getUserList(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        session.close();
    }
}
