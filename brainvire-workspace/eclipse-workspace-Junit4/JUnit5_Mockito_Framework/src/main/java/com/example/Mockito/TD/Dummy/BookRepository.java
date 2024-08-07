package com.example.Mockito.TD.Dummy;

import java.util.Collection;

public interface BookRepository {

	void save(Book book);

	Collection<Book> findAll();
}
