package com.example.demo.Service;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Cart;
import com.example.demo.Model.User;
import com.example.demo.Request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);
	public String addCartItem(Long userId,AddItemRequest request) throws ProductException;
	public Cart findUserCart(Long userId);
}
