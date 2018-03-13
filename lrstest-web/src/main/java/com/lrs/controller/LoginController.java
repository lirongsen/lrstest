package com.lrs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lrs.bean.po.Test;
import com.lrs.service.TestService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private TestService serivce;
	
	@RequestMapping(value="/check/{userLoginId}" ,method=RequestMethod.GET)
	public Map<String,String> check(@PathVariable String userLoginId){
		Map<String,String> result = new HashMap<>();
		Test test = new Test();
		test.setId(userLoginId);
		test.setName(userLoginId);
		Test t = serivce.testRedis(test);
		result.put("isLogin", t.getName());
		return result;
	}
}
