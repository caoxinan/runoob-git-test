package com.example.hellowordeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/testservice")
public class HellowordeurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellowordeurekaclientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/home")
    public String home(){
        return "hello world from port " + port;
    }
}
