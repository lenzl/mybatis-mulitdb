package com.lenzl.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lenzl.mybatis.dao.StudentDao;
import com.lenzl.mybatis.domain.Student;

@Component
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAllStudents();
	}

	public Student findStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.findStudentById(id);
	}

	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.insertStudent(student);
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	

}
