package com.example.Spring_IntroThree.controller;

import com.example.Spring_IntroThree.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greet")
public  class GreetingController {


//    This was for UC1
//     http://localhost:8080/greet/ucone
//    @GetMapping("ucone")
//    public String greet(){
//        return "{\"message\": \"Hello, this is a GET request!\"}";
//    }



//    This is UC2
//    private final GreetingService greetingService;
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//        http://localhost:8080/greet/uctwo
//    @GetMapping("uctwo");
//    public String  greet(){
//        return "{\"message\": \"" + greetingService.getGreetingMessage() + "\"}";
//    }



////    This is UC3
//    http://localhost:8080/greet/ucthree?firstName=Aarushi&lastName=Gupta
//    private final GreetingService greetingService;
//    @Autowired
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//    @GetMapping("ucthree")
//    public String greet(@RequestParam(value = "firstName", required = false) String firstName,
//                        @RequestParam(value = "lastName", required = false) String lastName) {
//        return "{\"message\": \"" + greetingService.generateGreeting(firstName, lastName) + "\"}";
//    }


//  This is UC4
private final GreetingService greetingService;
    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @GetMapping("ucfour")
    public String greet(@RequestParam(value = "firstName", required = false) String firstName,
                        @RequestParam(value = "lastName", required = false) String lastName) {
        String message = greetingService.generateGreeting(firstName, lastName);
        greetingService.saveGreetingMessage(message);
        return "{\"message\": \"" + message + "\"}";
    }
}

