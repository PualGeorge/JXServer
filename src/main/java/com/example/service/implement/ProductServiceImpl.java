package com.example.service.implement;

import com.example.bean.Product;
import com.example.mapper.ProductMapper;
import com.example.service.declaration.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Product service.
 * @author pc
 */
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    /**
     * Gets product list.
     *
     * @return the product list
     */
    @Override
    public List<Product> getProductList() {
        return productMapper.getProductList();
    }
}
