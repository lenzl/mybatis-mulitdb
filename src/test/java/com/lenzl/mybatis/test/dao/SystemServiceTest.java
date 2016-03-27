package com.lenzl.mybatis.test.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.lenzl.mybatis.service.SystemService;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext-mdatas.xml" })
public class SystemServiceTest extends AbstractTransactionalJUnit4SpringContextTests{

	@Autowired
	private SystemService systemService;
	
	@Test
	public void findAllSystems (){
		
		List<System> list = systemService.findAllSystems();
		
		Assert.assertEquals(64, list.size());
		
	}
}
