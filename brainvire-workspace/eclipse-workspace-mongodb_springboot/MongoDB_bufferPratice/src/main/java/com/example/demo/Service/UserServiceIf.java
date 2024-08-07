package com.example.demo.Service;

import java.util.List;

import org.bson.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.Collection.User;

public interface UserServiceIf {

	User save(User user);

	List<User> getUserStartWith(String name);

	void deleteUser(int id);

	List<User> getUserByAge(Integer minAge, Integer maxAge);

	Page<User> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);

	List<Document> getOldestUserByCity();

	List<Document> getPopulationByCity();

}
