package com.sara.dao.Impl;

import com.sara.dao.CustomerRepository;
import com.sara.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Customer> getAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query from_customer = session.createQuery("from Customer");
        List list = from_customer.list();
        return list;

    }

    @Override
    public Customer getById(Long id) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        session.getTransaction().commit();
        session.close();
        return customer;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long save = (Long) session.save(customer);
        Customer customerAfterSaveInDataBase = session.get(Customer.class, save);
        session.getTransaction().commit();
        session.close();
        return customerAfterSaveInDataBase;

    }

    @Override
    public Customer updateCustomer(Customer customer) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(customer);
        Customer customer1 = session.get(Customer.class, customer.getId());
        session.getTransaction().commit();
        session.close();
        return customer1;
    }

    @Override
    public void deleteCustomer(Long id) {

        Customer customer = new Customer();
        customer.setId(id);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.remove(customer);
        session.getTransaction().commit();
        session.close();

    }
}
