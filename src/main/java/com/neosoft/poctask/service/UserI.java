package com.neosoft.poctask.service;

import java.util.List;

import com.neosoft.poctask.model.User;

public interface UserI {
	
	public void saveUser(User u);
	
	public User editUser(int userId);
	
	public User updateUser(User u);
	
	public void deleteUser(int userId);
	
	public User getUserByName(String name);
	
	public User getUserByPincode(String pincode);
	
	public User getUserBySurname(String surname);
	
	public List<User> getAllUser();
	
	public void deleteAll();
	
	
	
	

}
