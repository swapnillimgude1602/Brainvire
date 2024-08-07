package com.example.Mockito.TD.Stub;

import java.util.List;

public interface BookRepository {

	List<Book> findNewBooks(int days);

}
