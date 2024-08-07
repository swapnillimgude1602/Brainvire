package com.example.Mockito.TD.SpyTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Mockito.TD.Spy.Book;
import com.example.Mockito.TD.Spy.BookService;

public class SpyTest {

	@Test
	public void spyTest() {
		BookRepositorySpyTest bookRepository = new BookRepositorySpyTest();
		BookService bookService = new BookService(bookRepository);

		Book book1 = new Book(1, "mockito", 500);
		Book book2 = new Book(2, "mockito junit", 400);
		bookService.save(book1);
		bookService.save(book2);

		Assertions.assertEquals(2, bookRepository.timesCalled());
		assertTrue(bookRepository.calledWith(book2));
	}

}