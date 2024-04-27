package com.project.WebsiteKinhDoanhTheThao.service.serviceimpl;

import com.project.WebsiteKinhDoanhTheThao.model.Category;
import com.project.WebsiteKinhDoanhTheThao.repository.CategoryRepository;
import com.project.WebsiteKinhDoanhTheThao.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(long id) {
        return categoryRepository.getById(id);
    }
}
