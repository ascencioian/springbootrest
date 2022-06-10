package com.project.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.service.SneakerService;

@Controller
public class IndexController {
	
	@Autowired
	private SneakerService repo;
	
	@GetMapping("/")
	public String home(Model model) {
		
		
		model.addAttribute("something", "this is something");
		model.addAttribute( "sneaker", repo.getSneakers());
		return "index";
	}

}
