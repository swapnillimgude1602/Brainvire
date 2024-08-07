package com.sunbase.service;

import java.util.List;

import com.sunbase.entity.Customer;


public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer createCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer updateCustomer(Long id, Customer customer);
}

