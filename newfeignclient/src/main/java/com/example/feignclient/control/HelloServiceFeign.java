package com.example.feignclient.control;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-helloworld")
public interface HelloServiceFeign {

    @RequestMapping(value = "/testservice/home")
    public String hello();
}