package com.example.Junit4.StubbingTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.Junit4.Stubbing.Book;
import com.example.Junit4.Stubbing.BookRepository;
import com.example.Junit4.Stubbing.BookService;

@ExtendWith(MockitoExtension.class)
public class stubbingTest {

	@InjectMocks
	private BookService bookService;

	@Mock
	private BookRepository bookRepository;

	@Test
	public void testTotalCostOfBook() {
		List<Integer> books = new ArrayList<>();
		books.add(121);
		books.add(122);
		
		Book book1 = new Book(121, "Charles Babbage", 1000);
		Book book2 = new Book(122, "Harry Potter", 2000);
		
		when(bookRepository.findBookByBookId(121))
		.thenReturn(book1)
		.thenReturn(book1);
		
		//Stubbing
//		when(bookRepository.findBookByBookId(121)).thenReturn(book1);	//1)mockito will keep record of it
//		when(bookRepository.findBookByBookId(122)).thenReturn(book2);
		int actualCost = bookService.calculateTotalCost(books);
		assertEquals(3000, actualCost);
	}
}
