package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.BookEntity;
import com.example.demo.Repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@PostMapping("/savebook")
	public ResponseEntity<?> addBook(@RequestBody BookEntity bookEntity) {
		BookEntity book = this.bookRepository.save(bookEntity);
		return ResponseEntity.ok(book);
	}

	@GetMapping("/getbook")
	public ResponseEntity<?> getBooks() {
		return ResponseEntity.ok(this.bookRepository.findAll());
	}

}
