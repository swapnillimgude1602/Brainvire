package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.CartItemException;
import com.example.demo.Exception.ProductException;
import com.example.demo.Exception.UserException;
import com.example.demo.Model.User;
import com.example.demo.Response.ApiResponse;
import com.example.demo.Service.CartItemServiceImplementation;
import com.example.demo.Service.UserServiceImplementation;

@RestController
@RequestMapping("/api/cart_items/")
public class CartItemController {

	@Autowired
	private CartItemServiceImplementation cartItemServiceImplementation;
	@Autowired
	private UserServiceImplementation userService;

	@DeleteMapping("/{cartItemId}")
	public ResponseEntity<ApiResponse> deletProduct(@PathVariable("cartItemId") Long cartItemId,
			@RequestHeader("Authorization") String jwt) throws UserException, CartItemException {
		User user = userService.findUserProfileByJwt(jwt);
		cartItemServiceImplementation.removeCartItem(user.getId(), cartItemId);

		ApiResponse res = new ApiResponse();
		res.setMessage("Cart Item Deleted Successfully");
		res.setStatus(true);

		return new ResponseEntity<ApiResponse>(res, HttpStatus.OK);
	}

}
