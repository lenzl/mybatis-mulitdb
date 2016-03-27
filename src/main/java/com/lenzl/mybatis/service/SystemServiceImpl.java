package com.lenzl.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lenzl.mybatis.slave.dao.SystemDao;

@Component
@Transactional
public class SystemServiceImpl implements SystemService{
	
	@Autowired
	private SystemDao systemDao;

	@Transactional(readOnly=true)
	public List<System> findAllSystems() {
		
		return systemDao.findAllSystems();
	}

}
