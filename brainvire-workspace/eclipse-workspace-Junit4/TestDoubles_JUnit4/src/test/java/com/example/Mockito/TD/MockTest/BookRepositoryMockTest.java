package com.example.Mockito.TD.MockTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.Mockito.TD.Mock.Book;
import com.example.Mockito.TD.Mock.BookRepository;

public class BookRepositoryMockTest implements BookRepository {

	int saveCalled = 0;
	Book lastAddedBook = null;

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		saveCalled++;
		lastAddedBook = book;
	}

	public int timesCalled() {
		return saveCalled;
	}

	public boolean calledWith(Book book) {
		return lastAddedBook.equals(book);
	}

	public void verify(Book book, int times) {
		assertEquals(times, saveCalled);
		assertEquals(book, lastAddedBook);
		
	}
}
