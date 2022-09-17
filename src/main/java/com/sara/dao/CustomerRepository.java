package com.sara.dao;

import com.sara.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository {

    List<Customer> getAll();

    Customer getById(Long id);

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
