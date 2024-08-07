package com.example.Mockito.TD.FakeTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.Mockito.TD.Fake.Book;
import com.example.Mockito.TD.Fake.BookRepository;

public class BookRepositoryFakeTest implements BookRepository {

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
