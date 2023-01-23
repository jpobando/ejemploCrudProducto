package com.semillero.demo.dto;

import com.semillero.demo.entity.Product;

public class ProductDTO {
    private Long id;
    private double price;
    private String productType;

    public ProductDTO(Long id, double price, String productType) {
        this.id = id;
        this.price = price;
        this.productType = productType;
    }

    public ProductDTO() {
    }

    public ProductDTO(Product product){
        this.id = product.getId();
        this.price = product.getPrice();
        this.productType = product.getProductType();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
