package com.example.demo.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.OrderException;
import com.example.demo.Model.Address;
import com.example.demo.Model.Cart;
import com.example.demo.Model.CartItem;
import com.example.demo.Model.Order;
import com.example.demo.Model.OrderItem;
import com.example.demo.Model.User;
import com.example.demo.Repository.AddressRepository;
import com.example.demo.Repository.OrderItemRepository;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.Repository.UserRepository;

@Service
public class OrderServiceImplementation implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CartServiceImplementation cartService;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderItemServiceImplementation orderItemService;

	@Autowired
	private OrderItemRepository orderItemRepository;

	public OrderServiceImplementation(OrderRepository orderRepository, CartServiceImplementation cartService,
			AddressRepository addressRepository, UserRepository userRepository,
			OrderItemServiceImplementation orderItemService, OrderItemRepository orderItemRepository) {
		super();
		this.orderRepository = orderRepository;
		this.cartService = cartService;
		this.addressRepository = addressRepository;
		this.userRepository = userRepository;
		this.orderItemService = orderItemService;
		this.orderItemRepository = orderItemRepository;
	}

	@Override
	public Order createOrder(User user, Address shippingAddress) {
		// TODO Auto-generated method stub
		shippingAddress.setUser(user);
		Address address = addressRepository.save(shippingAddress);
		user.getAddresses().add(address);
		userRepository.save(user);

		Cart cart = cartService.findUserCart(user.getId());
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		for (CartItem cartItem : cart.getCartItems()) {

			OrderItem orderItem = new OrderItem();
			orderItem.setPrice(cartItem.getPrice());
			orderItem.setProduct(cartItem.getProduct());
			orderItem.setQuantity(cartItem.getQuantity());
			orderItem.setSize(cartItem.getSize());
			orderItem.setUserid(cartItem.getUserId());
			orderItem.setDiscountedPrice(cartItem.getDiscountedPrice());

			OrderItem createOrderItem = orderItemRepository.save(orderItem);
			orderItems.add(createOrderItem);
		}

		Order createdOrder = new Order();
		
		createdOrder.setUser(user);
		createdOrder.setOrderItems(orderItems);
		createdOrder.setTotalPrice(cart.getTotalPrice());
		createdOrder.setTotalDiscountedPrice(cart.getTotalDiscountedPrice());
		createdOrder.setDiscount(cart.getDiscount());
		createdOrder.setTotalItem(cart.getTotalItem());

		createdOrder.setShippingAddress(address);
		createdOrder.setOrderDate(LocalDateTime.now());
		createdOrder.setOrderStatus("PENDING");
		createdOrder.getPaymentDetails().setPaymentStatus("PENDING");
		createdOrder.setCreatedAt(LocalDateTime.now());

		Order saveOrder = orderRepository.save(createdOrder);

		for (OrderItem item : orderItems) {
			item.setOrder(saveOrder);
			orderItemRepository.save(item);
		}

		return saveOrder;
	}

	@Override
	public Order findOrderById(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		Optional<Order> opt = orderRepository.findById(orderId);
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new OrderException("Order doesnot exist." + orderId);
	}

	@Override
	public List<Order> userOrderHistory(Long userId) {
		// TODO Auto-generated method stub
		List<Order> orders = orderRepository.getUsersOrder(userId);
		return orders;
	}

	@Override
	public Order placedOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		Order order = findOrderById(orderId);
		order.setOrderStatus("PLACED");
		order.getPaymentDetails().setPaymentStatus("COMPLETED");

		return null;
	}

	@Override
	public Order ConfirmedOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		Order order = findOrderById(orderId);
		order.setOrderStatus("CONFIRMED");
		return orderRepository.save(order);
	}

	@Override
	public Order shippedOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		Order order = findOrderById(orderId);
		order.setOrderStatus("SHIPPED");
		return orderRepository.save(order);
	}

	@Override
	public Order deliveredOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		Order order = findOrderById(orderId);
		order.setOrderStatus("DELIVERED");
		return orderRepository.save(order);
	}

	@Override
	public Order canceledOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		Order order = findOrderById(orderId);
		order.setOrderStatus("CANCELED");
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public void deleteOrder(Long orderId) throws OrderException {
		// TODO Auto-generated method stub
		Order order = findOrderById(orderId);
		orderRepository.deleteById(orderId);
	}

}
