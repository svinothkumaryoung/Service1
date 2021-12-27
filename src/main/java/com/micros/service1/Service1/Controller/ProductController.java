package com.micros.service1.Service1.Controller;

import com.micros.service1.Service1.entity.Product;
import com.micros.service1.Service1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/product/")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public Product addItems(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }

    @GetMapping("/viewProduct/{id}")
    public Product viewProduct(@PathVariable("id") Integer id)
    {
        return productService.findByProductId(id);
    }
}
