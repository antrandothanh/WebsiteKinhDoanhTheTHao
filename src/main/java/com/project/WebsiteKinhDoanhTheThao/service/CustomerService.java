package com.project.WebsiteKinhDoanhTheThao.service;

import com.project.WebsiteKinhDoanhTheThao.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    void deleteCustomerById(long id);
    void saveCustomer(Customer customer);
    Customer getCustomerById(long id);
}
