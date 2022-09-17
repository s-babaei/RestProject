package com.sara.service.Impl;

import com.sara.dao.CustomerRepository;
import com.sara.entity.Customer;
import com.sara.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {

        return customerRepository.getAll();
    }

    @Override
    public Customer getById(Long id) {

        return customerRepository.getById(id);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.saveCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long id) {

        customerRepository.deleteCustomer(id);

    }
}
