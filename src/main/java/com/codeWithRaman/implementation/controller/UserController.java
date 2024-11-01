package com.codeWithRaman.implementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeWithRaman.implementation.model.User;
import com.codeWithRaman.implementation.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getById(id).orElse(null); 
	}
	
	@PostMapping
	public User save(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
