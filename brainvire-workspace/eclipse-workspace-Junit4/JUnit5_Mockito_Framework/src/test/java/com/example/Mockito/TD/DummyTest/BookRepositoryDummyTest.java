package com.example.Mockito.TD.DummyTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.Mockito.TD.Dummy.Book;
import com.example.Mockito.TD.Dummy.BookRepository;


public class BookRepositoryDummyTest implements BookRepository {

	// in memory db/hashmap/list
	Map<Integer, Book> bookStore = new HashMap<Integer, Book>();

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		bookStore.put(book.getBookId(), book);

	}

	@Override
	public Collection<Book> findAll() {
		// TODO Auto-generated method stub
		return bookStore.values();
	}

}
