package com.example.demo.Service;

import java.util.List;

import com.example.demo.Exception.OrderException;
import com.example.demo.Model.Address;
import com.example.demo.Model.Order;
import com.example.demo.Model.User;

public interface OrderService {

	public Order createOrder(User user, Address shippingAddress);

	public Order findOrderById(Long orderId) throws OrderException;

	public List<Order> userOrderHistory(Long userId);

	public Order placedOrder(Long orderId) throws OrderException;

	public Order ConfirmedOrder(Long orderId) throws OrderException;

	public Order shippedOrder(Long orderId) throws OrderException;

	public Order deliveredOrder(Long orderId) throws OrderException;

	public Order canceledOrder(Long orderId) throws OrderException;

	public List<Order> getAllOrder();

	public void deleteOrder(Long orderId) throws OrderException;

}
