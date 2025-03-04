<<<<<<< HEAD
package com.example.Spring_IntroThree.Repository;


import com.example.Spring_IntroThree.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    Optional<AuthUser> findByEmail(String email);

    boolean existsByEmail(String email);
}
=======
package com.example.Spring_IntroThree.Repository;


import com.example.Spring_IntroThree.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    Optional<AuthUser> findByEmail(String email);

    boolean existsByEmail(String email);
}
>>>>>>> bca94c47a627062d85c439b918a3c4e642b5e570
