package com.semillero.demo.repository;

import com.semillero.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product,Long> {
}
