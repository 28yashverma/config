package com.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

	@Autowired
	private Environment environment;

	@GetMapping("/")
	public String getHealth() {
		return "OK";
	}

	@GetMapping("/backend")
	public String backend() {
		System.out.println("Inside my Ribbon controller backend");
		System.out.println("Server Port : " + environment.getProperty("local.server.port"));
		return "Hello from backend";
	}

}
