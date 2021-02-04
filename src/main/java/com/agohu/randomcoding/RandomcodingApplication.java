package com.agohu.randomcoding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.agohu.randomcoding"})
@MapperScan("com.agohu.randomcoding")
public class RandomcodingApplication {
    public static void main(String[] args) {
        SpringApplication.run(RandomcodingApplication.class, args);
    }

}
