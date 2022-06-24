package com.project.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.entity.Sneaker;
import com.project.entity.User;
import com.project.service.SneakerService;
import com.project.service.UserService;

@Controller
public class MainController {
	
	
	
	@Autowired
	private SneakerService repo;
	
	@Autowired
	private UserService userRepo;
	
	//-----------------------------------------getters for views
	@GetMapping("/")
	public String home(Model model) {
		User user = new User();
	    model.addAttribute("user", user);
	    Sneaker s1 = new Sneaker();
        model.addAttribute("s1", s1);
		model.addAttribute("something", "this is something");
		model.addAttribute( "sneaker", repo.getSneakers());
		
		return "index";
	}
	
	
	  @GetMapping("/gallery")
	    public String gallery(Model model) {
	        //User user = new User();
	        //model.addAttribute("user", user);
		  model.addAttribute( "sneaker", repo.getSneakers());
	         
	        return "gallery";
	    }
	
	  @GetMapping("/signup")
	    public String showForm(Model model) {
	        User user = new User();
	        model.addAttribute("user", user);
	         
	         
	        return "signup";
	    }
	  
	  @GetMapping("/product")
	    public String showProduct(Model model) {
	        User user = new User();
	        model.addAttribute("user", user);
	        model.addAttribute( "sneaker", repo.getSneakers());
	         
	        return "product";
	    }
	  
	  
	  @GetMapping("/productX")
	    public String showProductX(Model model) {
	        User user = new User();
	        model.addAttribute("user", user);
	         
	         
	        return "productX";
	    }
	  
	  @GetMapping("/login")
	    public String showLogin(Model model) {
	        User user = new User();
	        model.addAttribute("user", user);
	         
	         
	        return "login";
	    }
	  
	  
	  
	  @PostMapping("/signup")
	  public String submitLoginForm(@ModelAttribute("user") User user) {
		  System.out.println(user);
		  userRepo.createUser(user);
	      return "index";
	  }
	  
	  @PostMapping("/product")
	  public String showproductForm(@ModelAttribute("s1") Sneaker s1, Model model) {
		  model.addAttribute("s1", s1);
		  System.out.println(s1);
		  model.addAttribute( "sneaker", repo.getSneakers());
		 
	      return "product";
	  }

}
