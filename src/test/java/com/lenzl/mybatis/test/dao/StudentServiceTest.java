package com.lenzl.mybatis.test.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.lenzl.mybatis.domain.Student;
import com.lenzl.mybatis.service.StudentService;


@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class StudentServiceTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	@Autowired
	private StudentService studentService;
	
	@Test
	public void findAllStudents(){
		
		List<Student> studentList = studentService.findAllStudents();
		
		Assert.assertEquals(2, studentList.size());
		
	}

}
