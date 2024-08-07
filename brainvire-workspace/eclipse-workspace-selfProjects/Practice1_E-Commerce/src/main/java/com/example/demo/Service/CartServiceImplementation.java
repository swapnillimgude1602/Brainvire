package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ProductException;
import com.example.demo.Model.Cart;
import com.example.demo.Model.CartItem;
import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import com.example.demo.Repository.CartRepository;
import com.example.demo.Request.AddItemRequest;

@Service
public class CartServiceImplementation implements CartService {

	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private CartItemService cartItemService;
	@Autowired
	private ProductService productService;

	
	public CartServiceImplementation(CartRepository cartRepository, CartItemService cartItemService,
			ProductService productService) {
		super();
		this.cartRepository = cartRepository;
		this.cartItemService = cartItemService;
		this.productService = productService;
	}

	@Override
	public Cart createCart(User user) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setUser(user);

		return cartRepository.save(cart);
	}

	@Override
	public String addCartItem(Long userId, AddItemRequest request) throws ProductException {
		// TODO Auto-generated method stub
		Cart cart = cartRepository.findByUserId(userId);
		Product product = productService.findProductById(request.getProductId());
		CartItem isPresent = cartItemService.isCartItemExist(cart, product, request.getSize(), userId);
		if (isPresent == null) {
			CartItem cartItem = new CartItem();
			cartItem.setProduct(product);
			cartItem.setCart(cart);
			cartItem.setQuantity(request.getQuantity());
			cartItem.setUserId(userId);
			int price = request.getQuantity() * product.getDiscountedPrice();
			cartItem.setPrice(price);
			cartItem.setSize(request.getSize());

			CartItem createdCartItem = cartItemService.createCartItem(cartItem);
			cart.getCartItems().add(createdCartItem);
		}
		return "Item added to cart";
	}

	@Override
	public Cart findUserCart(Long userId) {
		// TODO Auto-generated method stub
		Cart cart = cartRepository.findByUserId(userId);
		int totalPrice = 0;
		int totalDiscountedPrice = 0;
		int totalItem = 0;

		for (CartItem cartItem : cart.getCartItems()) {
			totalPrice = totalPrice + cartItem.getPrice();
			totalDiscountedPrice = totalDiscountedPrice + cartItem.getDiscountedPrice();
			totalItem = totalItem + cartItem.getQuantity();
		}

		cart.setTotalDiscountedPrice(totalDiscountedPrice);
		cart.setTotalItem(totalItem);
		cart.setTotalPrice(totalPrice);
		cart.setDiscount(totalPrice - totalDiscountedPrice);

		return cartRepository.save(cart);
	}

}
