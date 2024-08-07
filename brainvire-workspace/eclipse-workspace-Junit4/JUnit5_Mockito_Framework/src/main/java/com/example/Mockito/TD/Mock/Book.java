package com.example.Mockito.TD.Mock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	private int bookId;
	private String bookName;
	private int bookPrice;

}
