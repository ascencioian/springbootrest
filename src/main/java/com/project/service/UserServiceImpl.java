package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Sneaker;
import com.project.entity.User;
import com.project.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	//---------------------get----------------------
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		 return (List<User>) repo.findAll();
	}

	@Override
	public Optional<User> getUser(String email) {
		// TODO Auto-generated method stub
		return repo.findById(email);
	}

	//--------------------post-------------------------
	@Override
	public User createUser(User u1) {
		// TODO Auto-generated method stub
		repo.save(u1);
		
		return u1;
	}
	
	//----------------------delete------------------

	@Override
	public void deleteUser(String email) {
		// TODO Auto-generated method stub
		repo.deleteById(email);
	}

}
