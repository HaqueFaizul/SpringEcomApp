package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.User;
import com.ecom.repo.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@GetMapping("/alluser")
	public List<User> getAllUser()
	{
		return userRepo.findAll();
	}

}
