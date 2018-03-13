package com.lrs.service;

import com.lrs.bean.po.Test;

public interface TestService {
	
	Test test(String id);
	
	void insertTest(Test test);
	
	Test testRedis(Test test);
}
