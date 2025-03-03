package com.example.Spring_IntroThree;

import com.example.Spring_IntroThree.Service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    private final GreetingService greetingService;


    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //    http://localhost:8080/greet
    @GetMapping
    public String  greet(){
        return "{\"message\": \"" + greetingService.getGreetingMessage() + "\"}";
    }

//    @PostMapping
//    public String createGreeting(@RequestBody String body) {
//        return "{\"message\": \"POST request received with data: " + body + "\"}";
//    }
//
//    @PutMapping
//    public String updateGreeting(@RequestBody String body) {
//        return "{\"message\": \"PUT request received with updated data: " + body + "\"}";
//    }
//
//    @DeleteMapping
//    public String deleteGreeting(@RequestParam String name) {
//        return "{\"message\": \"DELETE request received to delete " + name + "\"}";
//    }
}

