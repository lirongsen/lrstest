package com.lrs.business;

import com.lrs.bean.po.Test;

public interface TestBusiness {

	Test select(String key);
	
	void insert(Test test);
	
	void insertRedis(String key,Test value);
	
	Test selectRedis(String key);
}
