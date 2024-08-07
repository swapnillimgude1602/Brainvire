package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Integer>{

	//custom finder methods/Derieved Query methods
	// public List<Employee> findByemployeeNameAndemployeeAddress(String name, String address);

}
