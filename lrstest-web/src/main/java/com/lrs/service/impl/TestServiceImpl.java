package com.lrs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrs.bean.po.Test;
import com.lrs.business.TestBusiness;
import com.lrs.service.TestService;

@Service
@Transactional
public class TestServiceImpl implements TestService {

	@Autowired
	private TestBusiness testBusiness;
	
	@Override
	public Test test(String id) {
		// TODO Auto-generated method stub
		return testBusiness.select(id);
	}

	@Override
	public void insertTest(Test test) {
		testBusiness.insert(test);
	}

	@Override
	public Test testRedis(Test test) {
		testBusiness.insertRedis("aaa", test);
		return testBusiness.selectRedis("aaa");
	}

}
