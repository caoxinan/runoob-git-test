package com.example.feignclient.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestClientController {

    @Autowired
    private HelloServiceFeign client;

    @RequestMapping(value="/test")
    public String demoServiceTest() {
        StringBuffer sb = new StringBuffer();
        sb.append(client.hello());
        return sb.toString();
    }
}
