package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.entity.Sneaker;

public interface SneakerService {
	  //save operation
	  //Sneaker saveSneaker(Sneaker s1);
	  
	  // read operations
	   List<Sneaker> getSneakers();
	   //get one
	   Optional<Sneaker> getSneaker(String sku);
	
}
