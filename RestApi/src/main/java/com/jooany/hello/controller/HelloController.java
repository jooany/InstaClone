package com.jooany.hello.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins="http://18.217.255.224:8001")
@RestController
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public Map<String, String> apiJson() { 
		final Map<String, String> map = new HashMap<>(); 
		map.put("message", "WelcomeParty");
		return map; 	
	}
}
