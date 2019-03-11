package com.spring.orm.Aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by User on 2019/3/8.
 */
//指定单元测试环境
    @RunWith(SpringJUnit4ClassRunner.class)
//    指定配置文件路径
    @ContextConfiguration(locations={"/Spring.xml"})
public class UserDAOTest {
        @Autowired
        private  UserDAO userDAO;
    @Test
    public void test() {
        userDAO.insert();
    }

}