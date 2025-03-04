package com.example.Spring_IntroThree.Service;

import com.example.Spring_IntroThree.Repository.GreetingRepository;
import com.example.Spring_IntroThree.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GreetingService {


//    This is UC2
//    public String getGreetingMessage(){
//        return "Hello World!";
//    }


//    This is UC3
//public String generateGreeting(String firstName, String lastName) {
//    if (firstName != null && lastName != null) {
//        return "Hello, " + firstName + " " + lastName + "!";
//    } else if (firstName != null) {
//        return "Hello, " + firstName + "!";
//    } else if (lastName != null) {
//        return "Hello, " + lastName + "!";
//    } else {
//        return "Hello World!";
//    }
//}


  //  This is UC4
//    private final GreetingRepository greetingRepository;
//
//    @Autowired
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//    public String generateGreeting(String firstName, String lastName) {
//        if (firstName != null && lastName != null) {
//            return "Hello, " + firstName + " " + lastName + "!";
//        } else if (firstName != null) {
//            return "Hello, " + firstName + "!";
//        } else if (lastName != null) {
//            return "Hello, " + lastName + "!";
//        } else {
//            return "Hello World!";
//        }
//    }
//    public void saveGreetingMessage(String message) {
//        Greeting greeting = new Greeting(message);
//        greetingRepository.save(greeting);
//    }



//    This is UC5
//private final GreetingRepository greetingRepository;
//    @Autowired
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//    public Optional<Greeting> findGreetingById(Long id) {
//        return greetingRepository.findById(id);
//    }


//  This is UC6
//private final GreetingRepository greetingRepository;
//    @Autowired
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//    public List<Greeting> findAllGreetings() {
//        return greetingRepository.findAll();
//    }
//    public Optional<Greeting> findGreetingById(Long id) {
//        return greetingRepository.findById(id);
//    }



//
//    This is UC7
//private final GreetingRepository greetingRepository;
//    @Autowired
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//    public Optional<Greeting> findGreetingById(Long id) {
//        return greetingRepository.findById(id);
//    }
//    public Optional<Greeting> updateGreeting(Long id, String newMessage) {
//        Optional<Greeting> greetingOptional = greetingRepository.findById(id);
//        if (greetingOptional.isPresent()) {
//            Greeting greeting = greetingOptional.get();
//            greeting.setMessage(newMessage);
//            greetingRepository.save(greeting);
//            return Optional.of(greeting);
//        } else {
//            return Optional.empty();
//        }
//    }



//    This is UC8
private final GreetingRepository greetingRepository;

    @Autowired
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    public Optional<Greeting> findGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
    public void saveGreetingMessage(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);
        greetingRepository.save(greeting);
    }
    public boolean deleteGreeting(Long id) {
        if (greetingRepository.existsById(id)) {
            greetingRepository.deleteById(id);
            return true;
        }
        return false;
    }

}