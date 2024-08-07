package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "customer_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	@NotEmpty(message = "Required")
	private String firstName;

	@NotEmpty(message = "Required")
	private String lastName;

	private String street;
	private String address;
	private String city;
	private String state;

	@Email
	private String email;

	@NotNull
	@Size(min = 5, max = 10)
	private String phone;

}
