package com.example.Junit4.Stubbing;

import java.util.List;

public interface BookRepository {
	
	List<Book> findNewBooks(int days);
	Book findBookByBookId(int bookID);

}
	