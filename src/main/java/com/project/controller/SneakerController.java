package com.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	

			return repo.getSneakers();
			
		}
}
