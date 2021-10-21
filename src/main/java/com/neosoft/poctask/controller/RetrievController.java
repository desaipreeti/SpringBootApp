package com.neosoft.poctask.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poctask.model.User;
import com.neosoft.poctask.service.UserI;

@RestController
public class RetrievController {
	
	@Autowired
	private UserI ui;
	
	@GetMapping("/getall")
	public List<User> getAllUser()
	{
		List<User>ulist=ui.getAllUser();
		return ulist;
	}

	@GetMapping("/getallbydob")
	public List<User> getAllUserByDob()
	{
		List<User> ulist=ui.getAllUser().stream().sorted(Comparator.comparing(User::getDob)).collect(Collectors.toList());;
	
		return ulist;
		
	}
	
	@GetMapping("/getallbydoj")
	public List<User> getAllUserByDoj()
	{
		List<User> ulist=ui.getAllUser().stream().sorted(Comparator.comparing(User::getDoj)).collect(Collectors.toList());;
		
		return ulist;
	}

	
	
	@GetMapping("getname/{name}")
	public User getUserByName(@PathVariable String name)
	{
		User ulist=ui.getUserByName(name);
		return ulist;
	}
	
	
	
	  @GetMapping("getsurname/{surname}")
	  public User getUserBySurname(@PathVariable String surname) 
	  
	  { 
		  User ulist=ui.getUserBySurname(surname); 
		  
		  return ulist; 
		  
	  }
	  
	  @GetMapping("getpincode/{pincode}") 
	  public User getUserByPincode(@PathVariable String pincode) { 
		  
		  User ulist=ui.getUserByPincode(pincode); 
		  return ulist; 
		  
	  }
	 
}


