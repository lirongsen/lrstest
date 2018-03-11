package com.lrs.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lrs.bean.po.Test;
import com.lrs.business.TestBusiness;
import com.lrs.dao.TestMapper;

@Repository
public class TestBusinessImpl implements TestBusiness {
	
	@Autowired
	private TestMapper testMapper;
	
	@Override
	public Test select(String key) {
		
		return testMapper.selectByPrimaryKey(key);
	}

	@Override
	public void insert(Test test) {
		testMapper.insert(test);

		throw new RuntimeException();
		
	}

}
