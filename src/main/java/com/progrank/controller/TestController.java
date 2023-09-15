package com.progrank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@GetMapping("/hello")
public String helloworld() {
	return "Helloworld";
}
@GetMapping("/hello2")
public String helloworld2() {
	return "Helloworld2";
}
}
