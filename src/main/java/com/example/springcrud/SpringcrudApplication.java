package com.example.springcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
@MapperScan(basePackages = "com.example.springcrud")
public class SpringcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcrudApplication.class, args);
    }
}
