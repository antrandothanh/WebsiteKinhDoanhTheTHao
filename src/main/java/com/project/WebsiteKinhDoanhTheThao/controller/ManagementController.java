package com.project.WebsiteKinhDoanhTheThao.controller;

import com.project.WebsiteKinhDoanhTheThao.service.AdminService;
import com.project.WebsiteKinhDoanhTheThao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagementController {
    @Autowired
    //private AdminService adminService;
    private CustomerService customerService;

    @GetMapping("/customer-account-management")
    public String showAllCustomers(Model model) {
        model.addAttribute("CustomersList", customerService.getAllCustomers());
        return "customer";
    }
}
