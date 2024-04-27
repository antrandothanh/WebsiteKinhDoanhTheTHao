package com.project.WebsiteKinhDoanhTheThao.repository;

import com.project.WebsiteKinhDoanhTheThao.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
