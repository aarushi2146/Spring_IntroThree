<<<<<<< HEAD
package com.example.Spring_IntroThree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan("com.example.Spring_IntroThree.model")
public class SpringIntroThreeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringIntroThreeApplication.class, args);
	}


}
=======
package com.example.Spring_IntroThree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan("com.example.Spring_IntroThree.model")
public class SpringIntroThreeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringIntroThreeApplication.class, args);
	}


}
>>>>>>> bca94c47a627062d85c439b918a3c4e642b5e570
