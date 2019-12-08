package com.ruijie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ruijie.mapper")
public class Appliaction {
    public static void main(String[] args) {
        SpringApplication.run(Appliaction.class, args);
    }
}
