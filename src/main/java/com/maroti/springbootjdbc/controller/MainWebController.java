package com.maroti.springbootjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainWebController {

    @ResponseBody
    @GetMapping({"/welcome"})
    public List<String> welcomeMsg(){
        return Arrays.asList("Hello,", "Welcome", "To", "Spring Boot", "World");
    }
}
