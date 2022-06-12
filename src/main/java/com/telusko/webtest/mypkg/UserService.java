package com.telusko.webtest.mypkg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public List<User> getUser(){
		return userRepo.findAll();
	}

}
