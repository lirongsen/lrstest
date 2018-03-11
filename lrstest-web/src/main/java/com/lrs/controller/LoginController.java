package com.lrs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value="/check/{userLoginId}" ,method=RequestMethod.GET)
	public Map<String,Boolean> check(@PathVariable String userLoginId){
		Map<String,Boolean> result = new HashMap<String, Boolean>();
		result.put("isLogin", true);
		return result;
	}
}
