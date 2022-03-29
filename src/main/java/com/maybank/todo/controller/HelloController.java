package com.maybank.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.maybank.todo.entity.UserRepository;

@Controller
public class HelloController {
	
	
	/*
	 * @Autowired UserRepository repo;
	 */
	
	@GetMapping("/hello")
	public String hello() {
		return"hello";
	}
}
