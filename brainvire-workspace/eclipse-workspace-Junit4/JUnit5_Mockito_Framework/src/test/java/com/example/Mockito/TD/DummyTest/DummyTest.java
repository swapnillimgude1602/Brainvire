package com.example.Mockito.TD.DummyTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.Mockito.TD.Dummy.Book;
import com.example.Mockito.TD.Dummy.BookRepository;
import com.example.Mockito.TD.Dummy.BookService;
import com.example.Mockito.TD.Dummy.EmailService;



public class DummyTest {
	
	@Test
	public void dummy() {
		
		BookRepository bookRepository = new BookRepositoryDummyTest();
		EmailService service = new DummyEmailService();
		BookService bookService = new BookService(bookRepository,service);

		bookService.save(new Book(1, "Albert Eienstine", 200));
		bookService.save(new Book(2, "Bob Marley", 500));

		Assertions.assertEquals(2, bookService.findNoOfBook());
		
	}
	
	@Test
	public void dummyTestMockito() {
		BookRepository bookRepository = Mockito.mock(BookRepositoryDummyTest.class);
		EmailService emailService = Mockito.mock(DummyEmailService.class);
		
		Book book1 = new Book(1, "Albert Eienstine", 200);
		Book book2 = new Book(1, "Jomm aliyas", 400);

	}

}
