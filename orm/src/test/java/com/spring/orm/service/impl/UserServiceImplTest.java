package com.spring.orm.service.impl;

import com.spring.orm.entity.User;
import com.spring.orm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by User on 2019/3/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void insertUser()throws IOException{
        User user=new User();
        user.setAccount("aaa");
        user.setPassword("111");
        user.setCredit(333);
        int n=userService.insertUser(user);
        assertEquals(1,n);
    }

    @Test
    public void deleteUser() throws IOException {
        int n = userService.deleteUser(10);
        assertEquals(1,n);
    }

    @Test
    public void updateUser() throws IOException {
        User user = userService.getUser(10);
        user.setPassword("222");
        user.setCredit(333);
        int n=userService.updateUser(user);
        assertEquals(1,n);
    }

    @Test
    public void selectUsers()  throws IOException{
        List<User> users = userService.selectUsers();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void getUser() throws IOException {
        User user= userService.getUser(1);
        System.out.println(user);
    }

}