package com.lenzl.mybatis.test.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.lenzl.mybatis.domain.User;
import com.lenzl.mybatis.service.SystemService;
import com.lenzl.mybatis.service.UserService;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext-mdatas.xml" })
public class MulitServiceTest extends AbstractTransactionalJUnit4SpringContextTests{

	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SystemService systemService;
	
	@Test
	public void mulitDataBaseTest(){
		
		User user =new User();
		user.setUser_name("spring");
		
		userService.insertUser(user);
		
		List<System> list = systemService.findAllSystems();
		
		Assert.assertEquals(64, list.size());
		
	}
	
}
