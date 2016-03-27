package com.lenzl.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lenzl.mybatis.domain.User;
import com.lenzl.mybatis.master.dao.UserDao;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao ;

	public void insertUser(User user) {
		
		userDao.insertUser(user);
		
	}

}
