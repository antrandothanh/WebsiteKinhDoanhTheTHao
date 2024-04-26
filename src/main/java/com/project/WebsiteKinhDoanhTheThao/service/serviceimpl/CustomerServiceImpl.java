package com.project.WebsiteKinhDoanhTheThao.service.serviceimpl;

import com.project.WebsiteKinhDoanhTheThao.model.Customer;
import com.project.WebsiteKinhDoanhTheThao.repository.CustomerRepository;
import com.project.WebsiteKinhDoanhTheThao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
