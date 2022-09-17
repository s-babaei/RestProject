package com.sara.rest;

import com.sara.dao.CustomerRepository;
import com.sara.entity.Customer;
import com.sara.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAll() {

        List<Customer> all = customerService.getAll();
        return all;
    }

    @GetMapping("/customers/{id}")
    public Customer getById(@PathVariable Long id) //get variable from url
    {
        Customer byId = customerService.getById(id);
        return byId;
    }

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer) //model come from postman
    {
        Customer customer1 = customerService.saveCustomer(customer);
        return customer1;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer) {
        Customer customer1 = customerService.updateCustomer(customer);
        return customer1;
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);

    }
}
