//package com.example.demo.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.Exception.OrderException;
//import com.example.demo.Model.Order;
//import com.example.demo.Repository.OrderRepository;
//import com.example.demo.Service.OrderService;
//import com.example.demo.Service.UserService;
//
//import net.authorize.Environment;
//import net.authorize.api.contract.v1.CreateCustomerPaymentProfileRequest;
//import net.authorize.api.contract.v1.CreateCustomerPaymentProfileResponse;
//import net.authorize.api.contract.v1.CreateCustomerProfileRequest;
//import net.authorize.api.contract.v1.CreateCustomerProfileResponse;
//import net.authorize.api.contract.v1.CreditCardType;
//import net.authorize.api.contract.v1.CustomerAddressType;
//import net.authorize.api.contract.v1.CustomerPaymentProfileType;
//import net.authorize.api.contract.v1.CustomerProfileType;
//import net.authorize.api.contract.v1.GetMerchantDetailsRequest;
//import net.authorize.api.contract.v1.GetMerchantDetailsResponse;
//import net.authorize.api.contract.v1.MerchantAuthenticationType;
//import net.authorize.api.contract.v1.MessageTypeEnum;
//import net.authorize.api.contract.v1.PaymentType;
//import net.authorize.api.contract.v1.ValidationModeEnum;
//import net.authorize.api.controller.CreateCustomerPaymentProfileController;
//import net.authorize.api.controller.CreateCustomerProfileController;
//import net.authorize.api.controller.GetMerchantDetailsController;
//import net.authorize.api.controller.base.ApiOperationBase;
//
//@RestController
//@RequestMapping("/api/payment")
//public class PaymentControllerAuthorizeNet {
//
//	private OrderService orderService;
//	@Autowired
//	private UserService userService;
//	@Autowired
//	private OrderRepository orderRepository;
//
////VERIFY ACCOUNT
//	public boolean verifyAccount(String loginId, String transactionKey) {
//		ApiOperationBase.setEnvironment(Environment.SANDBOX);
//
//		// set merchant auth
//		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
//		merchantAuthenticationType.setName(loginId);
//		merchantAuthenticationType.setTransactionKey(transactionKey);
//		ApiOperationBase.setMerchantAuthentication(merchantAuthenticationType);
//
//		// api req
//		GetMerchantDetailsRequest getRequest = new GetMerchantDetailsRequest();
//		getRequest.setMerchantAuthentication(merchantAuthenticationType);
//
//		// execute req
//		GetMerchantDetailsController controller = new GetMerchantDetailsController(getRequest);
//		controller.execute();
//		GetMerchantDetailsResponse getMerchantDetailsResponse = controller.getApiResponse();
//
//		// check for verification
//		if (getMerchantDetailsResponse != null
//				&& getMerchantDetailsResponse.getMessages().getResultCode() == MessageTypeEnum.OK) {
//			return true;
//
//		} else {
//			return true;
//
//		}
//
//	}
//
////CREATE CUSTOMER
//	public Object createCustomer(@PathVariable Long orderId, String loginId, String transactionKey,
//			String customerEmailId) throws OrderException {
//		// Set the request to operate in either the Sandbox or Production environment
//
//		Order order = orderService.findOrderById(orderId);
//
//		ApiOperationBase.setEnvironment(Environment.SANDBOX);
//
//		// Set merchant authentication details
//		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
//		merchantAuthenticationType.setName(loginId);
//		merchantAuthenticationType.setTransactionKey(transactionKey);
//
//		// Set customer profile data
//		CustomerProfileType customerProfileType = new CustomerProfileType();
//		customerProfileType.setMerchantCustomerId("Id " + order.getUser().getId());
//		customerProfileType.setEmail("Email " + order.getUser().getEmail());
//
//		// Create the API request and set the parameters for this specific request
//		CreateCustomerProfileRequest apiRequest = new CreateCustomerProfileRequest();
//		apiRequest.setMerchantAuthentication(merchantAuthenticationType);
//		apiRequest.setProfile(customerProfileType);
//
//		// Call the controller
//		CreateCustomerProfileController controller = new CreateCustomerProfileController(apiRequest);
//		controller.execute();
//
//		// Get the response
//		CreateCustomerProfileResponse response;
//		response = controller.getApiResponse();
//
//		// Parse the response to determine results
//		if (response != null && response.getMessages().getResultCode() == MessageTypeEnum.ERROR) {
//			return response.getMessages().getMessage().get(0).getText();
//		} else {
//			return response;
//		}
//	}
//
////ADD CARD
//	public Object addCardInCustomer(String loginId, String transactionKey, String customerId, String cardNumber,
//			String cardCode, String expirationYear, String expirationMonth) throws Exception {
//
//		ApiOperationBase.setEnvironment(Environment.SANDBOX);
//
//		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
//		merchantAuthenticationType.setName(loginId);
//		merchantAuthenticationType.setTransactionKey(transactionKey);
//		ApiOperationBase.setMerchantAuthentication(merchantAuthenticationType);
//
//		// Create the API request and set the parameters for adding a payment profile
//		CreateCustomerPaymentProfileRequest apiRequest = new CreateCustomerPaymentProfileRequest();
//		apiRequest.setMerchantAuthentication(merchantAuthenticationType);
//		apiRequest.setCustomerProfileId(customerId);
//		apiRequest.setValidationMode(ValidationModeEnum.LIVE_MODE);
//
//		// Set credit card details
//		CreditCardType creditCard = new CreditCardType();
//		creditCard.setCardNumber(cardNumber);
//		creditCard.setExpirationDate(expirationYear + "-" + expirationMonth);
//		creditCard.setCardCode(cardCode);
//
//		CustomerPaymentProfileType profile = new CustomerPaymentProfileType();
//		profile.setPayment(creditCard);
//
//		// Populate the address data (Optional)
//		CustomerAddressType customerAddressType = new CustomerAddressType();
//		customerAddressType.setFirstName("Customer FirstName");
//		customerAddressType.setLastName("Customer LastName");
//		customerAddressType.setAddress("Customer address");
//		customerAddressType.setCity("Customer city");
//		customerAddressType.setState("Customer state");
//		customerAddressType.setZip("Customer zip code");
//		customerAddressType.setCountry("Customer country");
//
//		profile.setBillTo(customerAddressType);
//		apiRequest.setPaymentProfile(profile);
//
//		CreateCustomerPaymentProfileController controller = new CreateCustomerPaymentProfileController(apiRequest);
//		controller.execute();
//		CreateCustomerPaymentProfileResponse response;
//		response = controller.getApiResponse();
//
//		if (response != null && response.getMessages().getResultCode() == MessageTypeEnum.ERROR) {
//			return response.getMessages().getMessage().get(0).getText();
//		} else {
//			return response;
//		}
//	}
//}
