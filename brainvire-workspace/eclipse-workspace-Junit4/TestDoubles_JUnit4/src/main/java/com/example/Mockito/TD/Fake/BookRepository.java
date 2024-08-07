package com.example.Mockito.TD.Fake;

import java.util.Collection;

public interface BookRepository {

	void save(Book book);

	Collection<Book> findAll();
}
