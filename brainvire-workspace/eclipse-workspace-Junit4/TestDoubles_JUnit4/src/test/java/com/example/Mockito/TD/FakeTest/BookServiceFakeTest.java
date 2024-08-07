package com.example.Mockito.TD.FakeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Mockito.TD.Fake.Book;
import com.example.Mockito.TD.Fake.BookRepository;
import com.example.Mockito.TD.Fake.BookService;

public class BookServiceFakeTest {

	@Test
	public void saveTest() {
		BookRepository bookRepository = new BookRepositoryFakeTest();
		BookService bookService = new BookService(bookRepository);

		bookService.save(new Book(1, "Albert Eienstine", 200));
		bookService.save(new Book(2, "Bob Marley", 500));

		Assertions.assertEquals(2, bookService.findNoOfBook());
	}
}
