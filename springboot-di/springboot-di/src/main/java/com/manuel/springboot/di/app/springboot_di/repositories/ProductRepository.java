package com.manuel.springboot.di.app.springboot_di.repositories;

import com.manuel.springboot.di.app.springboot_di.models.Product;

import java.util.List;

public interface ProductRepository {
    public List<Product> findAll();

    public Product findById(Long id);
}
