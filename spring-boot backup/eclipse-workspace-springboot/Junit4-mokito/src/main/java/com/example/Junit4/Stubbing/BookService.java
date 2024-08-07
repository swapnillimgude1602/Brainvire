package com.example.Junit4.Stubbing;

import java.util.List;

public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public List<Book> getBookWithDiscount(int discountRate, int days) {
		List<Book> newBooks = bookRepository.findNewBooks(days);

		for (Book book : newBooks) {
			int price = book.getBookPrice();
			int newPrice = price - (discountRate * price / 100);
			book.setBookPrice(newPrice);
		}
		return newBooks;
	}

	public int calculateTotalCost(List<Integer> bookIds) {
		int total = 0;
		for (int bookID : bookIds) {
			Book book = bookRepository.findBookByBookId(bookID); 
			// 2)it will use the equals method on bookID compare with bookid in stubbing test
			/*
			 * Stubbing book repository method findBookByBookId and will pass the bookId
			 * mockito will use equals method to match the arguments with stubbing test when
			 * not provided Stubbing default value will be returned
			 */
			total = total + book.getBookPrice();
		}
		return total;
	}

}
