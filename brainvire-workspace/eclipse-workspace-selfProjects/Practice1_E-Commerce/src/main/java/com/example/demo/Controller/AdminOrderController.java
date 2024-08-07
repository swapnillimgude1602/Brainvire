package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.OrderException;
import com.example.demo.Model.Order;
import com.example.demo.Response.ApiResponse;
import com.example.demo.Service.OrderServiceImplementation;

@RestController
@RequestMapping("api/admin/orders")
public class AdminOrderController {

	@Autowired
	private OrderServiceImplementation orderService;

	@GetMapping("/")
	public ResponseEntity<List<Order>> getAllOrdersHandler() {
		List<Order> orders = orderService.getAllOrder();
		return new ResponseEntity<List<Order>>(orders, HttpStatus.ACCEPTED);
	}

	@PutMapping("/{orderId}/confirmed")
	public ResponseEntity<Order> confirmedOrderHandler(@PathVariable("orderId") long orderId,
			@RequestHeader("Authorization") String jwt) throws OrderException {
		Order order = orderService.ConfirmedOrder(orderId);

		return new ResponseEntity<>(order, HttpStatus.OK);

	}

	@PutMapping("/{orderId}/ship")
	public ResponseEntity<Order> shippedOrderHandler(@PathVariable("orderId") Long orderId,
			@RequestHeader("Authorization") String jwt) throws OrderException {

		Order order = orderService.shippedOrder(orderId);
		return new ResponseEntity<>(order, HttpStatus.OK);

	}

	@PutMapping("/{orderId}/delivered")
	public ResponseEntity<Order> deliverOrderHandler(@PathVariable("orderId") Long orderId,
			@RequestHeader("Authorization") String jwt) throws OrderException {

		Order order = orderService.deliveredOrder(orderId);
		return new ResponseEntity<>(order, HttpStatus.OK);

	}

	@PutMapping("/{orderId}/cancel")
	public ResponseEntity<Order> cancelOrderHandler(@PathVariable("orderId") Long orderId,
			@RequestHeader("Authorization") String jwt) throws OrderException {

		Order order = orderService.canceledOrder(orderId);
		return new ResponseEntity<>(order, HttpStatus.OK);

	}

	@DeleteMapping("/{orderId}/delete")
	public ResponseEntity<ApiResponse> deleteOrderHandler(@PathVariable("orderId") Long orderId,
			@RequestHeader("Authorization") String jwt) throws OrderException {

		orderService.deleteOrder(orderId);

		ApiResponse res = new ApiResponse();
		res.setMessage("order deleted Successfully");
		res.setStatus(true);

		return new ResponseEntity<>(res, HttpStatus.OK);

	}

}
