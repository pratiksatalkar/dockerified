package com.devops.docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//test line
    @GetMapping("/")
    public String hello() {
        return "Hello DevOps from Docker !!";
    }
}
