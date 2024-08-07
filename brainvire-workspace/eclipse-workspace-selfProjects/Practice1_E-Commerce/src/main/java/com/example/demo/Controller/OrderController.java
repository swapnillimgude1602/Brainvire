package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.OrderException;
import com.example.demo.Exception.UserException;
import com.example.demo.Model.Address;
import com.example.demo.Model.Order;
import com.example.demo.Model.User;
import com.example.demo.Service.OrderServiceImplementation;
import com.example.demo.Service.UserServiceImplementation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	private OrderServiceImplementation orderService;
	@Autowired
	private UserServiceImplementation userService;

	@PostMapping("/")
	public ResponseEntity<Order> createOrder(@RequestBody Address shippingAddress,
			@RequestHeader("Authorization") String jwt) throws UserException {
		User user = userService.findUserProfileByJwt(jwt);
		Order order = orderService.createOrder(user, shippingAddress);
		System.out.println("Order " + order);
		return new ResponseEntity<Order>(order, HttpStatus.CREATED);

	}

	@GetMapping("/user")
	public ResponseEntity<List<Order>> userOrderHistory(@RequestHeader("Authorization") String jwt)
			throws UserException {
		User user = userService.findUserProfileByJwt(jwt);
		List<Order> order = orderService.userOrderHistory(user.getId());
		return new ResponseEntity<List<Order>>(order, HttpStatus.CREATED);
	}

	@GetMapping("/{orderid}")
	public ResponseEntity<Order> findOrderById(@PathVariable("orderid") Long orderid,
			@RequestHeader("Authorization") String jwt) throws OrderException, UserException {
		User user = userService.findUserProfileByJwt(jwt);
		Order order = orderService.findOrderById(orderid);
		log.info("order {}",order);
		return new ResponseEntity<Order>(order, HttpStatus.ACCEPTED);
	}
}
