package com.mphasis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {


	@GetMapping("/getMsg")
	public String getMsg() {
		
		return "Welcome to Docker";
	}
}
