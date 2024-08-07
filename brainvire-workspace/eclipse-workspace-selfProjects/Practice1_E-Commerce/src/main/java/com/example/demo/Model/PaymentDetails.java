package com.example.demo.Model;

public class PaymentDetails {

	private String paymentMethod;
	private String paymentStatus;
	private String paymentId;
	private String razorPayPaymentLinkId;
	private String razorPayPaymentLinkReferenceId;
	private String razorPayPaymentLinkStatus;
	private String razorPayPaymentId;

	public PaymentDetails() {
		// TODO Auto-generated method stub

	}

		public PaymentDetails(String paymentMethod, String paymentStatus, String paymentId, String razorPayPaymentLinkId,
			String razorPayPaymentLinkReferenceId, String razorPayPaymentLinkStatus, String razorPayPaymentId) {
		super();
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
		this.paymentId = paymentId;
		this.razorPayPaymentLinkId = razorPayPaymentLinkId;
		this.razorPayPaymentLinkReferenceId = razorPayPaymentLinkReferenceId;
		this.razorPayPaymentLinkStatus = razorPayPaymentLinkStatus;
		this.razorPayPaymentId = razorPayPaymentId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getRazorPayPaymentLinkId() {
		return razorPayPaymentLinkId;
	}

	public void setRazorPayPaymentLinkId(String razorPayPaymentLinkId) {
		this.razorPayPaymentLinkId = razorPayPaymentLinkId;
	}

	public String getRazorPayPaymentLinkReferenceId() {
		return razorPayPaymentLinkReferenceId;
	}

	public void setRazorPayPaymentLinkReferenceId(String razorPayPaymentLinkReferenceId) {
		this.razorPayPaymentLinkReferenceId = razorPayPaymentLinkReferenceId;
	}

	public String getRazorPayPaymentLinkStatus() {
		return razorPayPaymentLinkStatus;
	}

	public void setRazorPayPaymentLinkStatus(String razorPayPaymentLinkStatus) {
		this.razorPayPaymentLinkStatus = razorPayPaymentLinkStatus;
	}

	public String getRazorPayPaymentId() {
		return razorPayPaymentId;
	}

	public void setRazorPayPaymentId(String razorPayPaymentId) {
		this.razorPayPaymentId = razorPayPaymentId;
	}

}
