package com.example.Mockito.TD.Dummy;

public class BookService {

	private BookRepository bookRepository;
	private EmailService emailService;
	
	public BookService(BookRepository bookRepository, EmailService emailService) {
		super();
		this.bookRepository = bookRepository;
		this.emailService = emailService;
	}

	public void save(Book book) {
		bookRepository.save(book);
	}

	public int findNoOfBook() {
		return bookRepository.findAll().size();
	}
}
