package com.project.WebsiteKinhDoanhTheThao.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private long price;
    @ManyToOne
    private Category category; //1 sản phẩm có 1 loại. 1 loại có nhiều sản phẩm.
    private String description;
    private String image_location;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_location() {
        return image_location;
    }

    public void setImage_location(String image_location) {
        this.image_location = image_location;
    }

    public Product(String productName, long productPrice, Category category, String description, String image_location) {
        this.name = productName;
        this.price = productPrice;
        this.category = category;
        this.description = description;
        this.image_location = image_location;
    }

    public Product() {
    }
}
