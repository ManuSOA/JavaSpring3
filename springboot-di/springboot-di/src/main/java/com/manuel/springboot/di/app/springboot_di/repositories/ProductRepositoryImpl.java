package com.manuel.springboot.di.app.springboot_di.repositories;

import com.manuel.springboot.di.app.springboot_di.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private final List<Product> listProduct;

    public ProductRepositoryImpl(){
        this.listProduct = Arrays.asList(
                new Product(1L,"memora corsair 32", 300L),
                new Product( 2L, "Cpu Intel Core I9", 850L),
                new Product(3L, "teclado razer mini 60%", 180L),
                new Product(4L,"motherboard Gigabyte", 490L)
        );
    }

    @Override
    public List<Product> findAll(){
        return listProduct;
    }

    @Override
    public Product findById(Long id){
        return listProduct.stream().filter(p ->p.getId().equals(id))
                .findFirst().orElseThrow();
    }

}
