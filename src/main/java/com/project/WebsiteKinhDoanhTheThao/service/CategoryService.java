package com.project.WebsiteKinhDoanhTheThao.service;

import com.project.WebsiteKinhDoanhTheThao.model.Category;
import jakarta.persistence.Entity;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(long id);
}
