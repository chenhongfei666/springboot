package com.ruijie.service;

import com.ruijie.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryById() {
        User user = userService.queryById(1L);
        System.out.println("user = " + user);
    }

    @Test
    public void saveUser() {

        User user = new User();
        user.setUserName("chf");
        user.setName("chf2");
        user.setAge(13);
        user.setPassword("123456");
        user.setSex(1);
        user.setCreated(new Date());
        userService.saveUser(user);
    }
}