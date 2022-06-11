package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Sneaker;
import com.project.entity.User;
import com.project.service.SneakerService;
import com.project.service.UserService;

@RestController
public class UserController {
		
		@Autowired
		private UserService userRepo;
		
			//-----------------------------------get
		
			@GetMapping("/users")
			public List<User> getUsers(){
				System.out.println("getUsers called");

				return userRepo.getUsers();
			}
			
			@GetMapping("/user/{email}")
			public Optional<User> getUser(@PathVariable("email") String email){
		
				System.out.println("getUser called");
				return userRepo.getUser(email);
				
			}
			
			//-----------------------------------post
			@PostMapping("/user")
			public User createUser(@RequestBody User u1) {
				System.out.println("createUser called");
				return userRepo.createUser(u1);
				
			}
			
			//------------------------------------delete
			@DeleteMapping("/user/{email}")
			public void deleteSneaker(@PathVariable("email") String email) {
				
				System.out.println("deleteUser called");
				userRepo.deleteUser(email);
			}
			
			//-------------------------------------put

}
