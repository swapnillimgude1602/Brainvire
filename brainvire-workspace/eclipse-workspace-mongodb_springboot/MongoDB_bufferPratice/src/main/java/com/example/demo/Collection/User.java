package com.example.demo.Collection;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "User_Table")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
	
	@Id
	private int userId;
	private String userFirstName;
	private String userLastName;
	private Integer userAge;
	private List<Address> address;
}
