package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
public class TestNegativeContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestNegativeContractApplication.class, args);
	}
}

@RestController
@RequiredArgsConstructor
class MyController {
	
	private final MyService service;
	
	@GetMapping("/api/v1/xxxx")
	String test() {
		return service.getFromService();
	}
	
	@GetMapping("/api/v1/testFail")
	String fail() {
		return service.failFromService();
	}
}
