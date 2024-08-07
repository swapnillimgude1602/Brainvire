package com.example.Mockito.TD.FakeTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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

	@Test
	public void saveTestMockito() {
		BookRepository bookRepository = Mockito.mock(BookRepositoryFakeTest.class);
		BookService bookService = new BookService(bookRepository);
		Book book1 = new Book(1, "Albert Eienstine", 200);
		Book book2 = new Book(2, "Bob Marley", 500);
		
		Collection<Book> book = new ArrayList<Book>();
		book.add(book1);
		book.add(book2);
		
	//	Stubbing
		Mockito.when(bookRepository.findAll()).thenReturn(book);
		assertEquals(2, bookService.findNoOfBook());
	}
}
