package com.example.demo.Entiy;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "micro_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

	@Id
	@Column(name = "ID")
	private String userId;

	@Column(name = "NAME")
	private String userName;

	@Email(message = "Enter Valid Email Address")
	@Column(name = "EMAIL")
	private String userEmail;

	@Column(name = "ABOUT")
	private String userAbout;

	@Transient
	private List<UserRating> ratings = new ArrayList<>();

}
