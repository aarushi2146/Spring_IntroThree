package com.example.Spring_IntroThree.Repository;

import com.example.Spring_IntroThree.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    // You can add custom query methods here if needed
}