package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Collection.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

	List<User> findByUserFirstNameStartsWith(String name);
	
	//by default repository Service
	//List<User> findByAgeBetween(Integer min, Integer max);
	
	//by query annotation
	
	@Query(value = "{'userAge':{$gt : ?0, $lt : ?1}}",
			fields="{address: 0}")
	List<User> findByUserAgeBetween(Integer min, Integer max);
	
}
