package com.example.demo.mysql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mysql.entities.Product;

@Repository
public interface productRepository extends JpaRepository<Product, Integer>{

}
