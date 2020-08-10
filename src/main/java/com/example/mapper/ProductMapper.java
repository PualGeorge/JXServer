package com.example.mapper;

import com.example.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Product mapper.
 * @author pc
 */
@Mapper
@Component
public interface ProductMapper {
    /**
     * Gets user list.
     *
     * @return the user list
     */
    @Select("SELECT * FROM productinfo")
    public List<Product> getProductList();

}
