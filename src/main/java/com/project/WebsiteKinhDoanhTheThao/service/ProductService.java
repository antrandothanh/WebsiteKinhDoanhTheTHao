package com.project.WebsiteKinhDoanhTheThao.service;

import com.project.WebsiteKinhDoanhTheThao.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void saveProduct(Product product);
    void deleteProductById(long id);
    Product getProductById(long id);
}
