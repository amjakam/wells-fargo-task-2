package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String categoryName;

    protected Category() {}

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return String.format(
                "Category[id=%d, categoryName='%s']",
                categoryId, categoryName);
    }

    // Getters and Setters

    public Long getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
