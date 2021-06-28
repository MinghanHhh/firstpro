package com.lmh.firstpro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.lmh.firstpro.dao")
@SpringBootApplication
public class FirstproApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstproApplication.class, args);
        System.out.println("这里是跑通的嘛");
    }

}
