package com.example.Spring_IntroThree.controller;

import com.example.Spring_IntroThree.Service.GreetingService;
import com.example.Spring_IntroThree.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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




////  This is UC4
//    http://localhost:8080/greet/ucfour
//private final GreetingService greetingService;
//    @Autowired
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//    @GetMapping("ucfour")
//    public String greet(@RequestParam(value = "firstName", required = false) String firstName,
//                        @RequestParam(value = "lastName", required = false) String lastName) {
//        String message = greetingService.generateGreeting(firstName, lastName);
//        greetingService.saveGreetingMessage(message);
//        return "{\"http request success\": \"" + message + "\"}";
//    }




//    This is UC5
//    http://localhost:8080/greet/ucfive/1
//private final GreetingService greetingService;
//    @Autowired
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//    @GetMapping("/ucfive/{id}")
//    public ResponseEntity<Greeting> getGreetingById(@PathVariable Long id) {
//        Optional<Greeting> greeting = greetingService.findGreetingById(id);
//        return greeting.map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }




//    This is UC6
//    http://localhost:8080/greet/ucsix
private final GreetingService greetingService;
    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Greeting> getGreetingById(@PathVariable Long id) {
        Optional<Greeting> greeting = greetingService.findGreetingById(id);
        return greeting.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/ucsix")
    public ResponseEntity<List<Greeting>> getAllGreetings() {
        List<Greeting> greetings = greetingService.findAllGreetings();
        if (greetings.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(greetings);
    }
}

