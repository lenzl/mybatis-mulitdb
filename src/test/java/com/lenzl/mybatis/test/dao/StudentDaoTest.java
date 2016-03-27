package com.lenzl.mybatis.test.dao;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.lenzl.mybatis.dao.StudentDao;
import com.lenzl.mybatis.domain.Student;


@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class StudentDaoTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	@Autowired
	private StudentDao studentDao;
	
	protected DataSource dataSource;

	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
		this.dataSource = dataSource;
	}
	
	@Test
	public void findAllStudents(){
		
		List<Student> studentList = studentDao.findAllStudents();
		
		Assert.assertEquals(2, studentList.size());
		
	}

}
