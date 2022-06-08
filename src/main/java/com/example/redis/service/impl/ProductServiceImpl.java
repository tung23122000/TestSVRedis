package com.example.redis.service.impl;

import com.example.redis.Repository.ProductRepository;
import com.example.redis.entity.Product;
import com.example.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  ProductRepository productRepository;

  @Override
  public Product createP(Product product) {
    return productRepository.save(product);
  }
}
