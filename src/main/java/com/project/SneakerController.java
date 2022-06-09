package com.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SneakerController {

		@GetMapping("/sneakers")
		public List<Sneaker> getSneakers(){
			List<Sneaker> sneakers = new ArrayList<>();
			
			Sneaker a1 = new Sneaker();
			a1.setBrand("brand");
			a1.setColorway("colorway");
			a1.setGender("female");
			a1.setImage("url");
			a1.setMarketvalue(100);
			a1.setName("test");
			a1.setReleasedate("03/02/1994");
			a1.setRetailprice(100);
			a1.setSku("test1234");
			
			Sneaker a2 = new Sneaker();
			a2.setBrand("brand");
			a2.setColorway("colorway");
			a2.setGender("female");
			a2.setImage("url");
			a2.setMarketvalue(100);
			a2.setName("test");
			a2.setReleasedate("03/02/1994");
			a2.setRetailprice(100);
			a2.setSku("test1234");
			
			sneakers.add(a1);
			sneakers.add(a2);
			
			return sneakers;
			
		}
}
