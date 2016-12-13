package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "CUSTOM_MESSAGE_HERE")
public class MyCustomException extends RuntimeException {
	
}
