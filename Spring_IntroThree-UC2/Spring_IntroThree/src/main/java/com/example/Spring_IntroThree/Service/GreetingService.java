package com.example.Spring_IntroThree.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage(){
        return "Hello World!";
    }

}
