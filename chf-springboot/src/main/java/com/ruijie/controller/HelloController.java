package com.ruijie.controller;

import com.ruijie.pojo.User;
import com.ruijie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @Value("${itcast.url}")
    private String itcastUrl;

    @Value("${itheima.url}")
    private String itheimaUrl;


    @GetMapping("hello")
    public String hello() {
        System.out.println("datesource=" + dataSource);
        System.out.println("itcasturl=" + itcastUrl);
        System.out.println("itheimaurl=" + itheimaUrl);
        return "hello,spring-boot";
    }

    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }
}
