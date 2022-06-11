package com.project.service;

import java.util.List;
import java.util.Optional;


import com.project.entity.User;

public interface UserService {
	  //----------------------------get operation------------
	  
	  //read all
	   List<User> getUsers();
	   //get one
	   Optional<User> getUser(String email);
	   
	   //----------------------------post----------------------
	   User createUser(User u1);
	   
	   //----------------------------put-----------------------
	   
	   //-------------------------delete-----------------------
	   
	   void deleteUser(String email);
}
