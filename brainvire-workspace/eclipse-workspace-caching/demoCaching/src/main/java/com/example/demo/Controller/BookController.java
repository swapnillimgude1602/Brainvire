package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Book;
import com.example.demo.Service.BookServiceImplementation;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookServiceImplementation bookService;

	@PostMapping("/add")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}

	@GetMapping("/get/{bookId}")
	public Book getBook(@PathVariable("bookId") int bookId) {
		return this.bookService.getBook(bookId);
	}

	@GetMapping("/getAll")
	public List<Book> getAllBooks() {
		List<Book> getAll = this.bookService.getAllBooks();
		return getAll;
	}

	@PutMapping("/update/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
		return this.bookService.updateBook(book, bookId);
	}

	@DeleteMapping("/delete/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		this.bookService.deleteBook(bookId);
	}
}
