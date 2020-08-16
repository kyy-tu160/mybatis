package com.example.springplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springplus.mapper")
public class SpringplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringplusApplication.class, args);
    }

}
