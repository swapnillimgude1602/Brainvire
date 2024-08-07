package com.example.demo.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.stereotype.Service;

import net.authorize.Environment;
import net.authorize.api.contract.v1.ArrayOfSetting;
import net.authorize.api.contract.v1.CreateCustomerPaymentProfileRequest;
import net.authorize.api.contract.v1.CreateCustomerPaymentProfileResponse;
import net.authorize.api.contract.v1.CreateCustomerProfileRequest;
import net.authorize.api.contract.v1.CreateCustomerProfileResponse;
import net.authorize.api.contract.v1.CreateTransactionRequest;
import net.authorize.api.contract.v1.CreateTransactionResponse;
import net.authorize.api.contract.v1.CreditCardType;
import net.authorize.api.contract.v1.CustomerAddressType;
import net.authorize.api.contract.v1.CustomerDataType;
import net.authorize.api.contract.v1.CustomerPaymentProfileMaskedType;
import net.authorize.api.contract.v1.CustomerPaymentProfileType;
import net.authorize.api.contract.v1.CustomerProfilePaymentType;
import net.authorize.api.contract.v1.CustomerProfileType;
import net.authorize.api.contract.v1.CustomerTypeEnum;
import net.authorize.api.contract.v1.GetCustomerProfileRequest;
import net.authorize.api.contract.v1.GetCustomerProfileResponse;
import net.authorize.api.contract.v1.GetHostedPaymentPageRequest;
import net.authorize.api.contract.v1.GetHostedPaymentPageResponse;
import net.authorize.api.contract.v1.GetMerchantDetailsRequest;
import net.authorize.api.contract.v1.GetMerchantDetailsResponse;
import net.authorize.api.contract.v1.MerchantAuthenticationType;
import net.authorize.api.contract.v1.MessageTypeEnum;
import net.authorize.api.contract.v1.PaymentProfile;
import net.authorize.api.contract.v1.PaymentType;
import net.authorize.api.contract.v1.SettingType;
import net.authorize.api.contract.v1.TransactionRequestType;
import net.authorize.api.contract.v1.TransactionTypeEnum;
import net.authorize.api.contract.v1.ValidationModeEnum;
import net.authorize.api.controller.CreateCustomerPaymentProfileController;
import net.authorize.api.controller.CreateCustomerProfileController;
import net.authorize.api.controller.CreateTransactionController;
import net.authorize.api.controller.GetCustomerProfileController;
import net.authorize.api.controller.GetHostedPaymentPageController;
import net.authorize.api.controller.GetMerchantDetailsController;
import net.authorize.api.controller.base.ApiOperationBase;

@Service
public class PaymentService {

	private Object CryptoJsUtility;

	public boolean verifyAccount(String loginId, String transactionKey) {
		// Set the environment to Sandbox for testing purposes. When deploying for
		// customer use, remember to set it to Production.
		ApiOperationBase.setEnvironment(Environment.SANDBOX);

		// Set merchant authentication details
		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
		merchantAuthenticationType.setName(loginId);
		merchantAuthenticationType.setTransactionKey(transactionKey);
		ApiOperationBase.setMerchantAuthentication(merchantAuthenticationType);

		// Prepare API request
		GetMerchantDetailsRequest getRequest = new GetMerchantDetailsRequest();
		getRequest.setMerchantAuthentication(merchantAuthenticationType);

		// Execute the request
		GetMerchantDetailsController controller = new GetMerchantDetailsController(getRequest);
		controller.execute();
		GetMerchantDetailsResponse getMerchantDetailsResponse = controller.getApiResponse();

		// Check if the verification is successful
		if (getMerchantDetailsResponse != null
				&& getMerchantDetailsResponse.getMessages().getResultCode() == MessageTypeEnum.OK) {
			return true;
		} else {
			return false;
		}
	}

	public Object createCustomer(String loginId, String transactionKey, String customerEmailId) {
		// Set the request to operate in either the Sandbox or Production environment
		ApiOperationBase.setEnvironment(Environment.SANDBOX);

		// Set merchant authentication details
		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
		merchantAuthenticationType.setName(loginId);
		merchantAuthenticationType.setTransactionKey(transactionKey);

		// Set customer profile data
		CustomerProfileType customerProfileType = new CustomerProfileType();
		customerProfileType.setMerchantCustomerId("Customer_1");
		customerProfileType.setEmail(customerEmailId);

		// Create the API request and set the parameters for this specific request
		CreateCustomerProfileRequest apiRequest = new CreateCustomerProfileRequest();
		apiRequest.setMerchantAuthentication(merchantAuthenticationType);
		apiRequest.setProfile(customerProfileType);

		// Call the controller
		CreateCustomerProfileController controller = new CreateCustomerProfileController(apiRequest);
		controller.execute();

		// Get the response
		CreateCustomerProfileResponse response;
		response = controller.getApiResponse();

		// Parse the response to determine results
		if (response != null && response.getMessages().getResultCode() == MessageTypeEnum.ERROR) {
			return response.getMessages().getMessage().get(0).getText();
		} else {
			return response;
		}
	}

	public Object addCardInCustomer(String loginId, String transactionKey, String customerId, String cardNumber,
			String cardCode, String expirationYear, String expirationMonth) throws Exception {
		setEnvironment();

		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
		merchantAuthenticationType.setName(loginId);
		merchantAuthenticationType.setTransactionKey(transactionKey);
		ApiOperationBase.setMerchantAuthentication(merchantAuthenticationType);

		// Create the API request and set the parameters for adding a payment profile
		CreateCustomerPaymentProfileRequest apiRequest = new CreateCustomerPaymentProfileRequest();
		apiRequest.setMerchantAuthentication(merchantAuthenticationType);
		apiRequest.setCustomerProfileId(customerId);
		apiRequest.setValidationMode(ValidationModeEnum.LIVE_MODE);

		// Set credit card details
		CreditCardType creditCard = new CreditCardType();
		creditCard.setCardNumber(CryptoJsUtility.decryptString(cardNumber));
		creditCard.setExpirationDate(expirationYear + "-" + expirationMonth);
		creditCard.setCardCode(cardCode);

		CustomerPaymentProfileType profile = new CustomerPaymentProfileType();
		profile.setPayment(new PaymentType().setCreditCard(creditCard));

		// Populate the address data (Optional)
		CustomerAddressType customerAddressType = new CustomerAddressType();
		customerAddressType.setFirstName("Customer FirstName");
		customerAddressType.setLastName("Customer LastName");
		customerAddressType.setAddress("Customer address");
		customerAddressType.setCity("Customer city");
		customerAddressType.setState("Customer state");
		customerAddressType.setZip("Customer zip code");
		customerAddressType.setCountry("Customer country");

		profile.setBillTo(customerAddressType);
		apiRequest.setPaymentProfile(profile);

		CreateCustomerPaymentProfileController controller = new CreateCustomerPaymentProfileController(apiRequest);
		controller.execute();
		CreateCustomerPaymentProfileResponse response;
		response = controller.getApiResponse();

		if (response != null && response.getMessages().getResultCode() == MessageTypeEnum.ERROR) {
			return response.getMessages().getMessage().get(0).getText();
		} else {
			return response;
		}
	}

	public CreateTransactionResponse createPayment(String loginId, String transactionKey, String customerId) {
		setEnvironment();

		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
		merchantAuthenticationType.setName(loginId);
		merchantAuthenticationType.setTransactionKey(transactionKey);
		ApiOperationBase.setMerchantAuthentication(merchantAuthenticationType);

		// Retrieve customer's payment profile ID
		String paymentProfileId = getCustomerPaymentProfileId(loginId, transactionKey, customerId);
		// Set the profile ID to charge
		CustomerProfilePaymentType profileToCharge = new CustomerProfilePaymentType();
		profileToCharge.setCustomerProfileId(customerId);

		PaymentProfile paymentProfile = new PaymentProfile();
		paymentProfile.setPaymentProfileId(paymentProfileId);
		profileToCharge.setPaymentProfile(paymentProfile);

		// Create the payment transaction request
		TransactionRequestType txnRequest = new TransactionRequestType();
		txnRequest.setTransactionType(TransactionTypeEnum.AUTH_CAPTURE_TRANSACTION.value());
		txnRequest.setProfile(profileToCharge);
		txnRequest.setAmount(BigDecimal.valueOf(collectPaymentDTO.getAmount()).setScale(2, RoundingMode.CEILING));

		CreateTransactionRequest apiRequest = new CreateTransactionRequest();
		apiRequest.setTransactionRequest(txnRequest);
		CreateTransactionController controller = new CreateTransactionController(apiRequest);
		controller.execute();

		return controller.getApiResponse();
	}

	// Helper method to retrieve the payment profile ID of the customer
	private String getCustomerPaymentProfileId(String loginId, String transactionKey, String customerId) {
		ApiOperationBase.setEnvironment(Environment.SANDBOX);

		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
		merchantAuthenticationType.setName(loginId);
		merchantAuthenticationType.setTransactionKey(transactionKey);
		ApiOperationBase.setMerchantAuthentication(merchantAuthenticationType);

		GetCustomerProfileRequest getRequest = new GetCustomerProfileRequest();
		getRequest.setMerchantAuthentication(merchantAuthenticationType);
		getRequest.setCustomerProfileId(customerId);

		GetCustomerProfileController controller = new GetCustomerProfileController(getRequest);
		controller.execute();
		GetCustomerProfileResponse getCustomerProfileResponse = controller.getApiResponse();

		if (getCustomerProfileResponse != null
				&& getCustomerProfileResponse.getMessages().getResultCode() == MessageTypeEnum.OK) {
			List<CustomerPaymentProfileMaskedType> paymentProfiles = getCustomerProfileResponse.getProfile()
					.getPaymentProfiles();
			if (paymentProfiles != null && !paymentProfiles.isEmpty()) {
				// Assuming the first payment profile is the one to be used, you can adjust this
				// logic based on your use case
				return paymentProfiles.get(0).getCustomerPaymentProfileId();
			}
		}

		return null; // Return null if payment profile ID retrieval failed
	}

	public Object getPaymentLink(String customerProfileId, String loginId, String transactionKey, Double amount) {
		ApiOperationBase.setEnvironment(Environment.SANDBOX);

		// Set the merchant authentication
		MerchantAuthenticationType merchantAuthenticationType = new MerchantAuthenticationType();
		merchantAuthenticationType.setName(loginId);
		merchantAuthenticationType.setTransactionKey(transactionKey);
		ApiOperationBase.setMerchantAuthentication(merchantAuthenticationType);

		// Set the customer profile to charge
		CustomerProfilePaymentType profileToCharge = new CustomerProfilePaymentType();
		profileToCharge.setCustomerProfileId(customerProfileId);

		// Get customer details
		Object customerDetail = getCustomerDetail(loginId, transactionKey, customerProfileId);
		GetCustomerProfileResponse getCustomerProfileResponse;

		if (customerDetail == null)
			throw new BusinessValidationException("Customer not found.");
		if (customerDetail instanceof String) {
			throw new BusinessValidationException(customerDetail.toString());
		} else {
			getCustomerProfileResponse = objectMapper.convertValue(customerDetail, GetCustomerProfileResponse.class);
		}

		// Set customer data
		CustomerDataType customerDataType = new CustomerDataType();
		customerDataType.setType(CustomerTypeEnum.INDIVIDUAL);
		customerDataType.setId(getCustomerProfileResponse.getProfile().getMerchantCustomerId());
		customerDataType.setEmail(getCustomerProfileResponse.getProfile().getEmail());

		// Create the payment transaction request
		TransactionRequestType txnRequest = new TransactionRequestType();
		txnRequest.setTransactionType(TransactionTypeEnum.AUTH_CAPTURE_TRANSACTION.value());
		txnRequest.setProfile(profileToCharge);
		txnRequest.setCustomer(customerDataType);
		txnRequest.setAmount(BigDecimal.valueOf(amount).setScale(2, RoundingMode.CEILING));

		// Set the hosted payment page settings
		SettingType setting1 = new SettingType();
		setting1.setSettingName("hostedPaymentButtonOptions");
		setting1.setSettingValue("{\"text\": \"Pay\"}");

		SettingType setting2 = new SettingType();
		setting2.setSettingName("hostedPaymentOrderOptions");
		setting2.setSettingValue("{\"show\": true}");

		SettingType setting3 = new SettingType();
		setting3.setSettingName("hostedPaymentPaymentOptions");
		setting3.setSettingValue("{\"cardCodeRequired\": true, \"showCreditCard\": true, \"showBankAccount\": false}");

		SettingType setting4 = new SettingType();
		setting4.setSettingName("hostedPaymentCustomerOptions");
		setting4.setSettingValue("{\"showEmail\": true, \"requiredEmail\": true, \"addPaymentProfile\": true}");

		String successUrl = "Please paste the URL of your success page for after successful payment.";
		String cancelUrl = "Please paste the URL of your cancel page for after canceling the payment.";
		SettingType setting5 = new SettingType();
		setting5.setSettingName("hostedPaymentReturnOptions");
		setting5.setSettingValue(
				"{\"showReceipt\": false, \"url\": \"" + successUrl + "\", \"urlText\": \"Continue\", \"cancelUrl\": \""
						+ cancelUrl + "\", \"cancelUrlText\": \"Cancel\"}");

		ArrayOfSetting settingList = new ArrayOfSetting();
		settingList.getSetting().add(setting1);
		settingList.getSetting().add(setting2);
		settingList.getSetting().add(setting3);
		settingList.getSetting().add(setting4);
		settingList.getSetting().add(setting5);

		GetHostedPaymentPageRequest apiRequest = new GetHostedPaymentPageRequest();
		apiRequest.setTransactionRequest(txnRequest);
		apiRequest.setHostedPaymentSettings(settingList);

		GetHostedPaymentPageController controller = new GetHostedPaymentPageController(apiRequest);
		controller.execute();

		GetHostedPaymentPageResponse response = controller.getApiResponse();

		if (response != null && response.getMessages().getResultCode() == MessageTypeEnum.ERROR) {
			return response.getMessages().getMessage().get(0).getText();
		} else {
			return response;
		}
	}

}
