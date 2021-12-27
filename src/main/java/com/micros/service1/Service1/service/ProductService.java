package com.micros.service1.Service1.service;

import com.micros.service1.Service1.entity.Product;
import com.micros.service1.Service1.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public Product addProduct(Product product)
    {
        return productRepo.save(product);
    }

    public Product findByProductId(Integer id)
    {
        return productRepo.findByProductId(id);
    }
}
