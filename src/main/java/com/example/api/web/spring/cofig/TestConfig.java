package com.example.api.web.spring.cofig;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.api.web.spring.entities.User;
import com.example.api.web.spring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Igor", "igor@gmail.com"); 
		User u2 = new User(null, "Francisca", "francisca@gmail.com");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
}