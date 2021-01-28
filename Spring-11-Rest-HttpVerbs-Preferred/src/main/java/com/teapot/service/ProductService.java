package com.teapot.service;

import com.teapot.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    List<Product> delete(Long id);
    List<Product> updateProduct(long id, Product product);
    List<Product> createProduct(Product product);
    Product getProduct(long id);
}
