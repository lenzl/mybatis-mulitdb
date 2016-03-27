package com.lenzl.mybatis.slave.dao;

import java.util.List;

import com.lenzl.mybatis.annotation.MyBatisRepository;

@MyBatisRepository
public interface SystemDao {
	
	public List<System> findAllSystems();

}
