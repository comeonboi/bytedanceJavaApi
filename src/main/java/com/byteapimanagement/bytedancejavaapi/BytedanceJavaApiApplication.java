package com.byteapimanagement.bytedancejavaapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.byteapimanagement.bytedancejavaapi.mapper")
public class BytedanceJavaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BytedanceJavaApiApplication.class, args);
    }

}
