package com.project.WebsiteKinhDoanhTheThao.controller;

import com.project.WebsiteKinhDoanhTheThao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CustomerManagementController {
    @Autowired
    //private AdminService adminService;
    private CustomerService customerService;

    @GetMapping("/customer-account-management")
    public String showAllCustomers(Model model) {
        model.addAttribute("CustomersList", customerService.getAllCustomers());
        return "customer";
    }

    @GetMapping("/delete-customer-account/{id}")
    public String deleteCustomer(@PathVariable (value = "id") long id) {
        customerService.deleteCustomerById(id);
        return "redirect:/customer-account-management";
    }
}
