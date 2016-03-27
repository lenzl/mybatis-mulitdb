package com.lenzl.mybatis.dao;

import java.util.List;

import com.lenzl.mybatis.annotation.MyBatisRepository;
import com.lenzl.mybatis.domain.Student;

@MyBatisRepository
public interface StudentDao {
	
	List<Student> findAllStudents();

	Student findStudentById(Integer id);

	void insertStudent(Student student);
	
}
