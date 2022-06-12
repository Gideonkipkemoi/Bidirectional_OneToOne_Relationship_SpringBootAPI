package com.telusko.webtest.mypkg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getTheUser(){
		return userService.getUser();
	}

}
