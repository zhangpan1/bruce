package com.zhang.bruce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhang.bruce.general.mysql")
public class BruceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BruceApplication.class, args);
    }

}
