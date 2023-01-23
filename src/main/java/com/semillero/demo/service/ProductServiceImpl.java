package com.semillero.demo.service;

import com.semillero.demo.dto.ProductDTO;
import com.semillero.demo.entity.Product;
import com.semillero.demo.repository.IProductRepository;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements  IProductService{

    public final IProductRepository iproductRepository;

    public ProductServiceImpl(IProductRepository iproductRepository) { this.iproductRepository = iproductRepository; }

    @Override
    public void save(ProductDTO productDTO) {
        this.iproductRepository.save(new Product(productDTO));
    }
}
