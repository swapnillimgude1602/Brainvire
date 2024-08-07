package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.BookEntity;

public interface BookRepository extends MongoRepository<BookEntity, Integer> {

}
