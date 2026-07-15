package com.skillsoft.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "This is the main page on Jetty";
    }

    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String welcome() {
        return "Welcome to Spring Boot! (still on Jetty!)";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "Hello Sprint Boot! (still on Jetty!)";
    }
}
