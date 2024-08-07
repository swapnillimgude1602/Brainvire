package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Collection.BinaryPhoto;

@Repository
public interface PhotoRepository extends MongoRepository<BinaryPhoto, String> {

}
