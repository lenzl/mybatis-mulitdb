package com.lenzl.mybatis.test.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.lenzl.mybatis.domain.User;
import com.lenzl.mybatis.service.UserService;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext-mdatas.xml" })
@TransactionConfiguration(defaultRollback=false)
public class UserServiceTest extends AbstractTransactionalJUnit4SpringContextTests{

	@Autowired
	private UserService userService;
	
	@Test
	public void inserUser (){
		
		User user =new User();
		user.setUser_name("lenzl");
		
		userService.insertUser(user);
		
	}
}
