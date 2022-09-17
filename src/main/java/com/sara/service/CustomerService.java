package com.sara.service;

import com.sara.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {


    List<Customer> getAll();
    Customer getById(Long id);
    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
