package com.manuel.springboot.di.app.springboot_di.services;

import com.manuel.springboot.di.app.springboot_di.models.Product;
import com.manuel.springboot.di.app.springboot_di.repositories.ProductRepository;
import com.manuel.springboot.di.app.springboot_di.repositories.ProductRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    public List<Product> findAll(){
        return productRepository.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.25d;
            Product newProduct = p.clone();
            newProduct.setPrice(priceImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id){
        return productRepository.findById(id);
    }
}
