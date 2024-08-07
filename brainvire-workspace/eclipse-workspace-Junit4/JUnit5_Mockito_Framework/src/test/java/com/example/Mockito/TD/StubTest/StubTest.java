package com.example.Mockito.TD.StubTest;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Mockito.TD.Stub.Book;
import com.example.Mockito.TD.Stub.BookRepository;
import com.example.Mockito.TD.Stub.BookService;

public class StubTest {
	
	@Test
	public void stubTest() {
		
		BookRepository bookRepository = new BookRepositoryStudTest();
		BookService bookService = new BookService(bookRepository);
		
		List<Book> newBookWithAppliedDiscount = bookService.getNewBookWithAppliedDiscount(10, 7);
		Assertions.assertEquals(2, newBookWithAppliedDiscount.size());
		Assertions.assertEquals(450,newBookWithAppliedDiscount.get(0).getBookPrice());
		Assertions.assertEquals(360,newBookWithAppliedDiscount.get(1).getBookPrice());

	}

}
