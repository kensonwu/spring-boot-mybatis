package com.kenson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kenson.*")	//扫描： 该包下的class， 主要是Mybatis的持久化类
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}