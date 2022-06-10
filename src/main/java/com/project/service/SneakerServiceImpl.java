package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Sneaker;
import com.project.repository.SneakerRepository;

@Service
public class SneakerServiceImpl implements SneakerService{

	@Autowired
	private SneakerRepository repo;
	

	//read
	@Override
	public List<Sneaker> getSneakers() {
		// TODO Auto-generated method stub
		 return (List<Sneaker>) repo.findAll();
	}

	//get one
	@Override
	public Optional<Sneaker> getSneaker(String sku) {
		// TODO Auto-generated method stub
		
		return repo.findById(sku);
		
	}

}
