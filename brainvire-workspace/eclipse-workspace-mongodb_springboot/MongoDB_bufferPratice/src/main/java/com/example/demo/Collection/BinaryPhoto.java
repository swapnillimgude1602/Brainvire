package com.example.demo.Collection;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "Photo")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BinaryPhoto {

	@Id
	private String id;
	private String title;
	private Binary photo;

}
