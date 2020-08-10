package com.example.service.implement;

import com.example.bean.Cart;
import com.example.mapper.CartMapper;
import com.example.service.declaration.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Cart service.
 * @author pc
 */
@Service
public class CartServiceImpl implements CartService {
    private final CartMapper cartMapper;

    public CartServiceImpl(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    /**
     * Gets cart list.
     *
     * @return the cart list
     */
    @Override
    public List<Cart> getCartList() {
        return cartMapper.getCartList();
    }

    /**
     * Add int.
     *
     * @param cart the cart
     * @return the int
     */
    @Override
    public int add(Cart cart) {
        return cartMapper.add(cart);
    }

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    @Override
    public int delete(int id) {
        return cartMapper.delete(id);
    }

    /**
     * Update int.
     *
     * @param id  the id
     * @param num the num
     * @return the int
     */
    @Override
    public int update(int id, int num) {
        return cartMapper.update(id,num);
    }
}
