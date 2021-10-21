package com.neosoft.poctask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poctask.exception.UserNotFoundException;
import com.neosoft.poctask.model.User;
import com.neosoft.poctask.service.UserI;

@RestController
public class EditController {
	
	
	@Autowired
	private UserI ui;
	
	@GetMapping("edituser/{userId}") 
	public User editUser(@PathVariable int userId)  throws UserNotFoundException
	{
		User u = ui.editUser(userId);
				
				return u;
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User u) 
	{
		User ulist=ui.updateUser(u);
				return ulist;
	}
	
	

}
