package com.example.redis.controller;

import com.example.redis.entity.Product;
import com.example.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  @Autowired
  ProductService productService;

  @PostMapping("/crp")
  public Product creatPro(@RequestBody Product product){
    return productService.createP(product);
  }
}
