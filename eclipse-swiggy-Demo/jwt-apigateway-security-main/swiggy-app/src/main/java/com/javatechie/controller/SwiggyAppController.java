package com.javatechie.controller;

import com.javatechie.dto.OrderResponseDTO;
import com.javatechie.service.SwiggyAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swiggy")
public class SwiggyAppController {

	@Autowired
	private SwiggyAppService service;

	@GetMapping("/home")
	public String greetingMessage() {
		return service.greeting();
	}

	@GetMapping("/{orderId}")
	public OrderResponseDTO checkOrderStatus(@PathVariable String orderId,
			@RequestHeader("LoggedInUser") String userName) {
		System.out.println("Logged i user: -" + userName);
		return service.checkOrderStatus(orderId);
	}
}
