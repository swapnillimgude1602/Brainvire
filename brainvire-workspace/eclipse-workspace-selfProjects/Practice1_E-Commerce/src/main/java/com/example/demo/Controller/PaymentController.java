//package com.example.demo.Controller;
//
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.Exception.OrderException;
//import com.example.demo.Exception.RazorPayException;
//import com.example.demo.Exception.UserException;
//import com.example.demo.Model.Order;
//import com.example.demo.Repository.OrderRepository;
//import com.example.demo.Response.ApiResponse;
//import com.example.demo.Response.PaymentLinkResponse;
//import com.example.demo.Service.OrderService;
//import com.example.demo.Service.UserService;
//import com.razorpay.Payment;
//import com.razorpay.PaymentLink;
//import com.razorpay.RazorpayClient;
//import com.razorpay.RazorpayException;
//
//@RestController
//@RequestMapping("/api")
//public class PaymentController {
//
//	@Autowired
//	private OrderService orderService;
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private OrderRepository orderRepository;
//
//	@PostMapping("/payments/{orderId}")
//	public ResponseEntity<PaymentLinkResponse> createPaymentLink(@PathVariable Long orderId,
//			@RequestHeader("Authorization") String jwt) throws RazorPayException, UserException, OrderException {
//
//		Order order = orderService.findOrderById(orderId);
//		try {
//			RazorpayClient razorpayClient = new RazorpayClient("3MHRx5Y7qcYC", "47h42C2QLvgVV2z2");
//
//			JSONObject paymentLinkRequest = new JSONObject();
//			paymentLinkRequest.put("amount", order.getTotalPrice() * 100); // order.getTotalPrice()*10 === convert into
//																			// rupees
//			paymentLinkRequest.put("currency", "INR");
//
//			JSONObject customer = new JSONObject();
//			customer.put("name", order.getUser().getFirstName());
//			customer.put("contact", order.getUser().getMobile());
//			customer.put("email", order.getUser().getEmail());
//
//			paymentLinkRequest.put("customer", customer);
//
//			JSONObject notify = new JSONObject();
//			notify.put("sms", true);
//			notify.put("email", true);
//
//			paymentLinkRequest.put("notify", notify);
//
//			paymentLinkRequest.put("callback_url", "http://localhost:4200/payment-success?order_id=" + order.getId());
//			// after successful redirect to this url
//			paymentLinkRequest.put("callback_method", "get");
//
//			PaymentLink paymentLink = razorpayClient.paymentLink.create(paymentLinkRequest);
//
//			String paymentLinkId = paymentLink.get("id");
//			String paymentLinkUrl = paymentLink.get("short_url");
//
//			PaymentLinkResponse paymentLinkResponse = new PaymentLinkResponse();
//			paymentLinkResponse.setPayment_link_id(paymentLinkId);
//			paymentLinkResponse.setPayment_link_url(paymentLinkUrl);
//
//			return new ResponseEntity<PaymentLinkResponse>(paymentLinkResponse, HttpStatus.CREATED);
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			throw new RazorPayException(e.getMessage());
//		}
//
//	}
//
//	public ResponseEntity<ApiResponse> updatePayment(@RequestParam(name = "payment_id") String paymentid,
//			@RequestParam(name = "order_id") Long orderid) throws OrderException, RazorPayException, RazorpayException {
//
//		RazorpayClient razorpayClient = new RazorpayClient("3MHRx5Y7qcYC", "47h42C2QLvgVV2z2");
//		// client is key pass
//		Order order = orderService.findOrderById(orderid);
//
//		try {
//
//			Payment payment = razorpayClient.payments.fetch(paymentid);
//			if (payment.get("status").equals("captured")) {
//				order.setOrderStatus("PLACED");
//				order.getPaymentDetails().setPaymentId(paymentid);
//				order.getPaymentDetails().setPaymentStatus("COMPLETED");
//				orderRepository.save(order);
//			}
//
//			ApiResponse apiResponse = new ApiResponse("Your order got Placed", true);
//
//			return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			throw new RazorPayException(e.getMessage());
//
//		}
//
//	}
//}
