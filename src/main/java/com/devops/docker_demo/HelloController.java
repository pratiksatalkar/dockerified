package com.devops.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/health")
    public String health() {
    	return "Application is healthy";
	}


    @GetMapping("/")
    public String hello() {
        String env = System.getenv("APP_ENV");
        if (env == null) {
            env = "default";
        }
        return "Hello DevOps from Docker !! Running in: " + env;
    }
}
