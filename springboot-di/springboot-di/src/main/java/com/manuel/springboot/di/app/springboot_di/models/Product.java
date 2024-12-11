package com.manuel.springboot.di.app.springboot_di.models;

public class Product {

    private Long id;
    private String name;
    private Long price;

    public Product(){}

    public Product(Long id, String name, Long price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
