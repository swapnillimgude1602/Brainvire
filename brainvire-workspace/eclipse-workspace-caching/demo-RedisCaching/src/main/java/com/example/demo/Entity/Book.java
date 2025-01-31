package com.example.demo.Entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@SuppressWarnings("serial")
@Document(collection = "Book_collection")
public class Book implements Serializable {

	@Id
	private int bookId;
	private String bookName;
	private String bookCategory;
	private String bookAuthor;
	private String bookPublisher;
	private String bookEdititon;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookEdititon() {
		return bookEdititon;
	}

	public void setBookEdititon(String bookEdititon) {
		this.bookEdititon = bookEdititon;
	}

	public Book(int bookId, String bookName, String bookCategory, String bookAuthor, String bookPublisher,
			String bookEdititon) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookEdititon = bookEdititon;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCategory=" + bookCategory + ", bookAuthor="
				+ bookAuthor + ", bookPublisher=" + bookPublisher + ", bookEdititon=" + bookEdititon + "]";
	}

}
