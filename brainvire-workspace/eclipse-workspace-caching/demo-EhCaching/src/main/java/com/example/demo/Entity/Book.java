package com.example.demo.Entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings("serial")

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Document(collection = "Book_Collection")
public class Book implements Serializable {

	@Id
	private int bookId;
	private String bookName;
	private String bookCategory;
	private String bookAuthor;
	private String bookPublisher;
	private String bookEdititon;

}