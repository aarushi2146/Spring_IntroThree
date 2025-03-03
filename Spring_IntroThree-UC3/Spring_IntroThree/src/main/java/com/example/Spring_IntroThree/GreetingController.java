package com.example.Spring_IntroThree;

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
//     http://localhost:8080/greet
//    @GetMapping
//    public String greet(){
//        return "{\"message\": \"Hello, this is a GET request!\"}";
//    }



//    This is UC2
//    private final GreetingService greetingService;
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//        http://localhost:8080/greet
//    @GetMapping
//    public String  greet(){
//        return "{\"message\": \"" + greetingService.getGreetingMessage() + "\"}";
//    }



//    This is UC3
private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // GET method that allows firstName and lastName to be passed as query parameters
    @GetMapping
    public String greet(@RequestParam(value = "firstName", required = false) String firstName,
                        @RequestParam(value = "lastName", required = false) String lastName) {
        // Generate the greeting using the service method
        return "{\"message\": \"" + greetingService.generateGreeting(firstName, lastName) + "\"}";
    }



}

