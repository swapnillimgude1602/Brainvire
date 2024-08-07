package com.example.demo.postgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.postgres.entities.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer>{

}
