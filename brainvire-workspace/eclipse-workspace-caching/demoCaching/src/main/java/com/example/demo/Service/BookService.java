package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Book;

public interface BookService {
	
	Book addBook(Book book);
	List<Book> getAllBooks();
	Book getBook(int bookId);
	Book updateBook(Book book, int bookId);
	void deleteBook(int bookId);

}
