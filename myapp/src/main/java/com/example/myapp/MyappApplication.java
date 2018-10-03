package com.example.myapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.myapp.entity.User;
import com.example.myapp.repository.UserRepository;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(UserRepository userRepository) {
		return (args) -> {
			userRepository.save(new User("James", "Lakes", "james25@gmail.com"));
			userRepository.save(new User("John", "Smith", "johnsmith@yahoo.com"));
			userRepository.save(new User("Jim ", "Morrison", "jimmor@hotmail.com"));
			userRepository.save(new User("David", "Gilmour", "davidg@yahoo.com"));
		};
}
}
