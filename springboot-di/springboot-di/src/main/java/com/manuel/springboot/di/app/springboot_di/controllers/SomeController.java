package com.manuel.springboot.di.app.springboot_di.controllers;

import com.manuel.springboot.di.app.springboot_di.models.Product;
import com.manuel.springboot.di.app.springboot_di.services.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {

    ProductServiceImpl service = new ProductServiceImpl();

    @GetMapping
    public List<Product> listProduct(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id){
        return service.findById(id);
    }
}
