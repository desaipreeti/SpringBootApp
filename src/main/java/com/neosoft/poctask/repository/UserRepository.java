package com.neosoft.poctask.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.poctask.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query(value="from User where name=:name")
	public User findByName(String name);
	
	
	@Query(value="from User where pincode=:pincode")
	public User findByPincode(String pincode);
	
	
	
	
	  @Query(value="from User where surname=:surname") 
	  public User findBySurname(String surname);
	 

}
