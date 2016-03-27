package com.lenzl.mybatis.master.dao;

import com.lenzl.mybatis.annotation.MyBatisRepository;
import com.lenzl.mybatis.domain.User;

@MyBatisRepository
public interface UserDao {
	
	public void insertUser(User user);

}
