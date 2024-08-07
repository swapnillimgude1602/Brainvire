package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ProductException;
import com.example.demo.Exception.UserException;
import com.example.demo.Model.Cart;
import com.example.demo.Model.User;
import com.example.demo.Request.AddItemRequest;
import com.example.demo.Response.ApiResponse;
import com.example.demo.Service.CartService;
import com.example.demo.Service.CartServiceImplementation;
import com.example.demo.Service.UserService;
import com.example.demo.Service.UserServiceImplementation;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartServiceImplementation cartService;
	@Autowired
	private UserServiceImplementation userService;

	@GetMapping("/")
	public ResponseEntity<Cart> findUserCart(@RequestHeader("Authorization") String jwt) throws UserException {
		User user = userService.findUserProfileByJwt(jwt);
		Cart cart = cartService.findUserCart(user.getId());

		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}

	@PutMapping("/add")
	public ResponseEntity<ApiResponse> addItemToCart(@RequestBody AddItemRequest request,
			@RequestHeader("Authorization") String jwt) throws UserException, ProductException {

		User user = userService.findUserProfileByJwt(jwt);
		cartService.addCartItem(user.getId(), request);

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage("item added to cart");
		apiResponse.setStatus(true);

		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
	}

}
