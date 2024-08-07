package com.example.demo.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Builder
@Document(collection = "Book_Collection")
public class BookEntity {
	
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
}