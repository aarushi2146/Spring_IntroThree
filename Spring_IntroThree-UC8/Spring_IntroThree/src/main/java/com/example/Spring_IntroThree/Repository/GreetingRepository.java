<<<<<<< HEAD
package com.example.Spring_IntroThree.Repository;

import com.example.Spring_IntroThree.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    // You can add custom query methods here if needed
=======
package com.example.Spring_IntroThree.Repository;

import com.example.Spring_IntroThree.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    // You can add custom query methods here if needed
>>>>>>> bca94c47a627062d85c439b918a3c4e642b5e570
}