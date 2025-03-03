package com.example.Spring_IntroThree.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {


//    This is UC2
//    public String getGreetingMessage(){
//        return "Hello World!";
//    }


//    This is UC3
public String generateGreeting(String firstName, String lastName) {
    if (firstName != null && lastName != null) {
        return "Hello, " + firstName + " " + lastName + "!";
    } else if (firstName != null) {
        return "Hello, " + firstName + "!";
    } else if (lastName != null) {
        return "Hello, " + lastName + "!";
    } else {
        return "Hello World!";
    }
}

}
