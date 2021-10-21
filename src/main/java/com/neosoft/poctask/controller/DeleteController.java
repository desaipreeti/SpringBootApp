package com.neosoft.poctask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poctask.exception.UserNotFoundException;
import com.neosoft.poctask.model.User;
import com.neosoft.poctask.service.UserI;

@RestController
public class DeleteController {
	
	
	@Autowired
	private UserI ui;
	
	@DeleteMapping("/deleteuser/{userId}")
	public String deleteUser(@PathVariable int userId) throws UserNotFoundException
	{
		ui.deleteUser(userId);
		return "data deleted";
	}
	
	@DeleteMapping("/deleteall")
	public void deleteAllUser()
	{
		ui.deleteAll();
	}
	
	
	

}
