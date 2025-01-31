package com.example.demo.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repository.BookRepository;

@Service
public class BookServiceImplementation implements BookService {

	private static final Logger logger = LoggerFactory.getLogger(BookServiceImplementation.class);
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		logger.info("Adding Book with Id",book.getBookId());		
		Book insert = this.bookRepository.save(book);
		return insert;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		logger.info("Geting all Books");
		List<Book> getBooks = this.bookRepository.findAll();
		return getBooks;
	}

	@Override
	@Cacheable(cacheNames = "books", key = "#bookId")
	public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		logger.info("get a Book",bookId);
		return this.bookRepository.findByBookId(bookId);
	}

	@Override
	@CachePut(cacheNames = "books", key = "#bookId")
	public Book updateBook(Book book, int bookId) {
		// TODO Auto-generated method stub
		logger.info("Updating book id:",book.getBookId());
		book.setBookId(bookId);
		Book update = this.bookRepository.save(book);
		return update;
	}

	@Override
	@CacheEvict(cacheNames = "books", key = "#bookId")
	public String deleteBook(int bookId) {
		// TODO Auto-generated method stub
		logger.info("Deleting book with id",bookId);
		this.bookRepository.deleteById(bookId);
		return "Book Deleted";
	}

}
