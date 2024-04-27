package com.project.WebsiteKinhDoanhTheThao.controller;

import com.project.WebsiteKinhDoanhTheThao.model.Category;
import com.project.WebsiteKinhDoanhTheThao.model.Product;
import com.project.WebsiteKinhDoanhTheThao.service.CategoryService;
import com.project.WebsiteKinhDoanhTheThao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductManagementController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/product-management")
    public String showAllProducts(Model model) {
        model.addAttribute("productsList", productService.getAllProducts());
        return "ProductManagement";
    }

    @GetMapping("/delete-product/{id}")
    public String deleteCustomer(@PathVariable(value = "id") long id) {
        productService.deleteProductById(id);
        return "redirect:/product-management";
    }

    @PostMapping({"/save-product", "/update-product"})
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/product-management";
    }

    @GetMapping("/add-new-product")
    public String showAddNewProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        //model.addAttribute("categoriesList", categoryService.getAllCategories());
        //model.addAttribute("image", imageService.getImageById(1));
        return "AddNewProduct";
    }

    @GetMapping("/update-product/{id}")
    public String showUpdateForm(@PathVariable (value = "id") long id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "UpdateCustomer";
    }

    @ModelAttribute("categoriesList")
    public List<Category> getCategories() {
        List<Category> list = categoryService.getAllCategories();
        return list;
    }
}
