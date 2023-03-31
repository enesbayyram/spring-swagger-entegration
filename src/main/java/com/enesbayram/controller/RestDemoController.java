package com.enesbayram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestDemoController {

	@GetMapping(value = "/helloworld")
	public String hello() {
		return "Hello World";
	}
}
