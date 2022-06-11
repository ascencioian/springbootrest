package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.entity.User;
import com.project.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User u1) {
		// TODO Auto-generated method stub
		repo.save(u1);
		
		return u1;
	}

	@Override
	public void deleteUser(String email) {
		// TODO Auto-generated method stub
		
	}

}
