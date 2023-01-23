package com.semillero.demo.controller;

import com.semillero.demo.dto.ProductDTO;
import com.semillero.demo.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductController {

    public final IProductService iProductService;

    public ProductController(IProductService iProductService){
        this.iProductService = iProductService;
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody ProductDTO productDTO){
        iProductService.save(productDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
