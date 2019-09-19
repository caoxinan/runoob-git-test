package com.example.helloworldeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@SpringBootApplication
@EnableEurekaServer
@SpringBootApplication
public class HelloworldeurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldeurekaserverApplication.class, args);
    }

}
