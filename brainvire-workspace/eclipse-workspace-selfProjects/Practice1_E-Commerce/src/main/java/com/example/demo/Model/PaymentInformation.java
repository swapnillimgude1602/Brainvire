package com.example.demo.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class PaymentInformation {

	@Column(name = "cardHolder_Name")
	private String cardHolderName;

	@Column(name = "card_Number")
	private String cardNumber;

	@Column(name = "expiration_Date")
	private LocalDate expirationDate;

	@Column(name = "cvv")
	private String cvv;

}
