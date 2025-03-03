package com.example.Spring_IntroThree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public  class GreetingController {

    @GetMapping
    public String greet(){
        return "{\"message\": \"Hello, this is a GET request!\"}";
    }


}

