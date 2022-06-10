package com.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.entity.Sneaker;
import com.project.repository.SneakerRepository;
import com.project.service.SneakerService;

@RestController
public class SneakerController {
	
	@Autowired
	private SneakerService repo;

		@GetMapping("/sneakers")
		public List<Sneaker> getSneakers(){
			System.out.println("getSneakers called");

			return repo.getSneakers();
		}
		
		@GetMapping("/sneaker/{sku}")
		public Optional<Sneaker> getSneaker(@PathVariable("sku") String sku){
	
			System.out.println("getSneaker called");
			return repo.getSneaker(sku);
			
		}
		
		
}
