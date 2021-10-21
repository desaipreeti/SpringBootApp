package com.neosoft.poctask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.neosoft.poctask.model.User;
import com.neosoft.poctask.repository.UserRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class PoctaskApplicationTests {
	
	@Autowired
	private  UserRepository urepo;
	
	
	@Test
	@Order(1)
	public void testPost()
	
	{
		User u= new User();
		u.setName("poonam");
		u.setSurname("chougule");
		u.setPincode("456332");
		u.setUserId(1);
		u.setDeleted(false);
		Date d1=new Date();
		u.setDob(d1);
		
		Date d2=new Date();
		u.setDoj(d2);
		urepo.save(u);
		assertNotNull(urepo.findById(1));
		
		}

	
	
	@Test
	@Order(2)
	public void testGetAll () {
		List list = (List) urepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	
	@Test
	@Order(3)
	public void testgetSingle () {
		User u = urepo.findById(1).get();
		assertEquals("poonam", u.getName());
	}

	
	@Test
	@Order(4)
	public void testUpdate () {
		User u = urepo.findById(1).get();
		u.setSurname("chougule");;
		urepo.save(u);
		assertNotEquals("ch", urepo.findById(1).get().getSurname());
	}
		
	@Test
	@Order(5)
	public void testName()
	{
		User u = urepo.findByName("poonam");
		assertEquals("poonam", u.getName());
	}
	
	@Test
	@Order(6)
	public void testsurPincode()
	{
		User u = urepo.findByPincode("456332");
		assertEquals("456332", u.getPincode());
	}
	
}
