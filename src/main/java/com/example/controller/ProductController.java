package com.example.controller;

import com.example.bean.Product;
import com.example.service.declaration.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Product controller.
 * @author pc
 */
@RestController
public class ProductController {
    private final ProductService productService;

    /**
     * Instantiates a new Product controller.
     *
     * @param productService the product service
     */
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Gets user list.
     *
     * @return the user list
     */
    @RequestMapping(value = "product/query", method = RequestMethod.GET)
    public List<Product> getUserList() {
        try {
            return productService.getProductList();
        } catch (Exception e) {
            System.out.println("getProductList failed!" + e.getMessage());
        }
        return null;
    }
}
