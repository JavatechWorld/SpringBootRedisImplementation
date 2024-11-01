package com.codeWithRaman.implementation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.codeWithRaman.implementation.model.User;
import com.codeWithRaman.implementation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Cacheable(value = "users",key = "#id")
	public Optional<User> getById(Long id) {
		System.out.println("Fetching Data from Database....................");
		return userRepository.findById(id);
	}
	
	@CacheEvict(value = "users", key = "#user.id")
	public User saveUser(User user) {
		return userRepository.save(user);
	}
}
