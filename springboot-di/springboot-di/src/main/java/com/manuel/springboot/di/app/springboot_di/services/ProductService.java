package com.manuel.springboot.di.app.springboot_di.services;

import com.manuel.springboot.di.app.springboot_di.models.Product;
import com.manuel.springboot.di.app.springboot_di.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    ProductRepository productRepository = new ProductRepository();

    public List<Product> findAll(){
        return productRepository.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.25d;
            p.setPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id){
        return productRepository.findById(id);
    }
}
