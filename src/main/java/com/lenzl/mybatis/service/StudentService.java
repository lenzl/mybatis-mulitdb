package com.lenzl.mybatis.service;

import java.util.List;

import com.lenzl.mybatis.annotation.MyBatisRepository;
import com.lenzl.mybatis.domain.Student;

public interface StudentService {

	
	List<Student> findAllStudents();

	Student findStudentById(Integer id);

	void insertStudent(Student student);
}
