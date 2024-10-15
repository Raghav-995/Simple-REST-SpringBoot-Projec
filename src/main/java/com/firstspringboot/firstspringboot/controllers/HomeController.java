package com.firstspringboot.firstspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
       return "Hello Raghav from Spring Boot!!";
    }

    @GetMapping("/about")
    public String about() {
        return "This is about page";
    }

    @GetMapping("/error")
    public String error() {
        return "This is error page";
    }
}
