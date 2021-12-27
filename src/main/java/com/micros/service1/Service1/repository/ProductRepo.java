package com.micros.service1.Service1.repository;

import com.micros.service1.Service1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    Product findByProductId(Integer id);
}
