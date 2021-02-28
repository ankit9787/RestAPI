package com.organisation.restAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoResource {

	@RequestMapping("/api")
	public String getHelloWorld() {
		return "Hello, this is an rest API call";
	}
}
