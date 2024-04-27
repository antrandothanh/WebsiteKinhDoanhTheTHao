package com.project.WebsiteKinhDoanhTheThao.service.serviceimpl;

import com.project.WebsiteKinhDoanhTheThao.model.Customer;
import com.project.WebsiteKinhDoanhTheThao.repository.CustomerRepository;
import com.project.WebsiteKinhDoanhTheThao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomerById(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(long id) {
        Optional<Customer> optional = customerRepository.findById(id);
        Customer customer = null;
        if (optional.isPresent()) {
            customer = optional.get();
        }
        else {
            throw new RuntimeException("Customer not found for id :: " + id);
        }
        return customer;
    }
}
