package com.example.service.declaration;

import com.example.bean.Cart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * The interface Cart service.
 * @author pc
 */
public interface CartService {
    /**
     * Gets cart list.
     *
     * @return the cart list
     */
    public List<Cart> getCartList();

    /**
     * Add int.
     *
     * @param cart the cart
     * @return the int
     */
    public int add(Cart cart);


    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    public int delete(int id);


    /**
     * Update int.
     *
     * @param id  the id
     * @param num the num
     * @return the int
     */
    public int update( int id,int num);
}
