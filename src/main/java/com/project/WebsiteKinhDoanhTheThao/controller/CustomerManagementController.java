package com.project.WebsiteKinhDoanhTheThao.controller;

import com.project.WebsiteKinhDoanhTheThao.model.Customer;
import com.project.WebsiteKinhDoanhTheThao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;
import java.time.LocalDate;

@Controller
public class CustomerManagementController {
    @Autowired
    //private AdminService adminService;
    private CustomerService customerService;

    @GetMapping("/customer-account-management")
    public String showAllCustomers(Model model) {
        model.addAttribute("CustomersList", customerService.getAllCustomers());
        return "CustomerManagement";
    }

    @GetMapping("/delete-customer-account/{id}")
    public String deleteCustomer(@PathVariable (value = "id") long id) {
        customerService.deleteCustomerById(id);
        return "redirect:/customer-account-management";
    }

    @PostMapping("/save-customer")
    public String saveCustomer(@ModelAttribute("customer")Customer customer) {
        customer.setCreateDate(LocalDate.now());
        customer.setUpdateDate(LocalDate.now());
        customerService.saveCustomer(customer);
        return "redirect:/customer-account-management";
    }

    @PostMapping("/update-customer")
    public String updateCustomer(@ModelAttribute("customer")Customer customer) {
        customer.setUpdateDate(LocalDate.now());
        customerService.saveCustomer(customer);
        return "redirect:/customer-account-management";
    }

    @GetMapping("/add-new-customer")
    public String showAddNewCustomerForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "AddNewCustomer";
    }

    @GetMapping("/update-customer/{id}")
    public String showUpdateForm(@PathVariable (value = "id") long id, Model model) throws ParseException {
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer", customer);
        return "UpdateCustomer";
    }
}
