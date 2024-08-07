package com.example.Mockito.TD.Mock;

public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public void save(Book book) {
		if(book.getBookPrice()>400)return;
		else bookRepository.save(book);	}
}
