package com.neosoft.poctask.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poctask.model.User;
import com.neosoft.poctask.service.UserI;

@RestController
public class RegisterController {
	
	
	@Autowired
	private UserI ui;
	
	@PostMapping("/saveuser")
	public void registerUser(@ Valid @RequestBody User u)
	{
		ui.saveUser(u);
		
		
	}

}
