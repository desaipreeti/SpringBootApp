package com.neosoft.poctask.service;



import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.poctask.model.User;
import com.neosoft.poctask.repository.UserRepository;

@Service
public class UserImp implements UserI {
	
	
	@Autowired
	UserRepository ur;

	@Override
	public void saveUser(User u) {
		
		User uu=ur.save(u);
	}

	@Override
	public User editUser(int userId) {
		User u= ur.findById(userId).get();
		return u;
	}

	@Override
	public User updateUser(User u) {
		User uu=ur.save(u);
		return u;
	}

	@Override
	public void deleteUser(int userId) {
		
		
		ur.deleteById(userId);
		}
		
		
	

	@Override
	public User getUserByName(String name) {
		User ulist=ur.findByName(name);
		 return ulist;
	}

	@Override
	public List<User> getAllUser() {
		List<User> ulist=(List<User>) ur.findAll();
		return ulist;
	}

	@Override
	public void deleteAll() {
		ur.deleteAll();
		
	}

	@Override
	public User getUserByPincode(String pincode) {
		User ulist=ur.findByPincode(pincode);
		 return ulist;
	}

	@Override
	public User getUserBySurname(String surname) {
		User ulist=ur.findBySurname(surname);
		 return ulist;
	}

	

	

	

	

}
