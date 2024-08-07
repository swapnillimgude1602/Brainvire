package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserCred;

@Repository
public interface UserRepository extends JpaRepository<UserCred, Integer> {
	Optional<UserCred> findByName(String username);

}
