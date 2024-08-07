package com.example.Mockito.TD.StubTest;

import java.util.ArrayList;
import java.util.List;

import com.example.Mockito.TD.Stub.Book;
import com.example.Mockito.TD.Stub.BookRepository;

public class BookRepositoryStudTest implements BookRepository {

	@Override
	public List<Book> findNewBooks(int days) {
		// TODO Auto-generated method stub
		
		List<Book> newBooks = new ArrayList<Book>();
		
		Book book1 = new Book(1, "Albert Eienstine", 500);
		Book book2 = new Book(2, "Mark hanirson", 400);
		newBooks.add(book1);
		newBooks.add(book2);
		return newBooks;
	}

}
