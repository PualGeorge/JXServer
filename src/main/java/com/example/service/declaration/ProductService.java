package com.example.service.declaration;

import com.example.bean.Product;

import java.util.List;

/**
 * The interface Product service.
 * @author pc
 */
public interface ProductService {
    /**
     * Gets product list.
     *
     * @return the product list
     */
    public List<Product> getProductList();
}
