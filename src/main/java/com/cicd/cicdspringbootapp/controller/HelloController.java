package com.cicd.cicdspringbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World from Harvey";
    }

    @GetMapping
    public String hi() {
        return "Hi the World from Harvey";
    }
}
