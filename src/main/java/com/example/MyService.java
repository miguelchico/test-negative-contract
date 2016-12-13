package com.example;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public String getFromService() {
		return "just a test";
	}
	
	public String failFromService() {
		throw new MyCustomException();
	}
}
