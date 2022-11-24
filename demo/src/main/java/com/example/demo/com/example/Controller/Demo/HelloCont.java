package com.example.demo.com.example.Controller.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCont {
	@GetMapping("/emp")
	public String getemployee() {
		return "SDFGgh ghhg";
		
	}

}
