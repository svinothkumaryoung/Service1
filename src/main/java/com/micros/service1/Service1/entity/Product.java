package com.micros.service1.Service1.entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_desc")
    private String ProductDescription;

    @Column(name="product_code")
    private Integer productCode;

    public Product() {
    }


    public Product(int productId, String productName, String productDescription, Integer productCode) {
        this.productId = productId;
        this.productName = productName;
        ProductDescription = productDescription;
        this.productCode = productCode;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }
}
