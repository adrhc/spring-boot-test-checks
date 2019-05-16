package com.example.scanningerror.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class DummyController {
	@GetMapping("/hello")
	public String hello() {
		log.debug("Hello World!");
		return "Hello World!";
	}
}
