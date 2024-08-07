package com.example.Mockito.TD.SpyTest;

import com.example.Mockito.TD.Spy.Book;
import com.example.Mockito.TD.Spy.BookRepository;

public class BookRepositorySpyTest implements BookRepository {

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

}
