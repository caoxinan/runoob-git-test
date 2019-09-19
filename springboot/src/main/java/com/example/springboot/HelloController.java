package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author: @我没有三颗心脏
 * add in tesing
 */

@Controller
public class HelloController {
    @Value("${content}")
    private String content;

     @Autowired
    private StudentProperties student;

   @RequestMapping("/hello")
    public String index(Model m) {
        //return "Hello World" + " name is the:" + student.getName() + " age is the:" + student.getAge();
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}