package com.semillero.demo.entity;

import com.semillero.demo.dto.ProductDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private Long id;
    private double price;
    private String productType;

    public Product(Long id, double price, String productType) {
        this.id = id;
        this.price = price;
        this.productType = productType;
    }

    public Product() {
    }

    public Product(ProductDTO productDTO){
        this.id = productDTO.getId();
        this.price = productDTO.getPrice();
        this.productType = productDTO.getProductType();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getProductType() { return productType; }

    public void setProductType(String productType) { this.productType = productType; }


}
