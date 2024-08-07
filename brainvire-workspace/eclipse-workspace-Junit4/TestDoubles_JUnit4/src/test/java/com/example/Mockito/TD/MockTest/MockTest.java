package com.example.Mockito.TD.MockTest;

import org.junit.jupiter.api.Test;

import com.example.Mockito.TD.Mock.Book;
import com.example.Mockito.TD.Mock.BookService;


public class MockTest {

	@Test
	public void mockTest() {
		BookRepositoryMockTest bookRepository = new BookRepositoryMockTest();
		BookService bookService = new BookService(bookRepository);

		Book book1 = new Book(1, "mockito", 500);
		Book book2 = new Book(2, "mockito junit", 400);
		
		bookService.save(book1);	// return
		bookService.save(book2);	// save wiill be called
		
		bookRepository.verify(book2, 1);

	}
}	
