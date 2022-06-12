package com.telusko.webtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telusko.webtest.mypkg.Items;
import com.telusko.webtest.mypkg.ItemsRepo;
import com.telusko.webtest.mypkg.User;
import com.telusko.webtest.mypkg.UserRepo;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		User user = new User();
		user.setName("testUser");
		user.setEmail("testUser@gmail.com");
		
		
		
		Items items = new Items();
		items.setName("Think big");
		items.setUser(user);
		
		user.setItem(items);
		userRepo.save(user);
		
	}

}
