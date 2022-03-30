package com.maybank.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.maybank.todo.entity.UserRepository;

@Controller
public class HomeController {
	
	/*
	 * @Autowired UserRepository repo;
	 */
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/login")
	public String index() {
		return "login";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/hallo")
	public String hallo() {
		return "hallo";
	}
	
}
