package com.project.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.entity.User;
import com.project.service.SneakerService;
import com.project.service.UserService;

@Controller
public class IndexController {
	
	
	
	@Autowired
	private SneakerService repo;
	
	@Autowired
	private UserService userRepo;
	
	@GetMapping("/")
	public String home(Model model) {
			
		model.addAttribute("something", "this is something");
		model.addAttribute( "sneaker", repo.getSneakers());
		return "index";
	}
	
	
	//-----------------------------sign up
	
	  @GetMapping("/signup")
	    public String showForm(Model model) {
	        User user = new User();
	        model.addAttribute("user", user);
	         
	         
	        return "signup";
	    }
	  
	  @PostMapping("/signup")
	  public String submitForm(@ModelAttribute("user") User user) {
		  System.out.println(user);
		  userRepo.createUser(user);
	      return "index";
	  }

}
