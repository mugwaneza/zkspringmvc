package com.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
public class StudentController {

	 @GetMapping("/demo")
	public String Dashboard() {
		
		return "views/login";
	}
	
	
    }
