package com.project.WebsiteKinhDoanhTheThao.service.serviceimpl;

import com.project.WebsiteKinhDoanhTheThao.model.Customer;
import com.project.WebsiteKinhDoanhTheThao.model.Product;
import com.project.WebsiteKinhDoanhTheThao.repository.ProductRepository;
import com.project.WebsiteKinhDoanhTheThao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProductById(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product getProductById(long id) {
        Optional<Product> optional = productRepository.findById(id);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        }
        else {
            throw new RuntimeException("Product not found for id :: " + id);
        }
        return product;
    }
}
