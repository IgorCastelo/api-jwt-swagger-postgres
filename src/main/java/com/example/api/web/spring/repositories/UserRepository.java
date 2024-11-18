package com.example.api.web.spring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.web.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
