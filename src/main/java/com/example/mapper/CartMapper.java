package com.example.mapper;

import com.example.bean.Cart;
import com.example.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Cart mapper.
 * @author pc
 */
@Mapper
@Component
public interface CartMapper {
    /**
     * Gets user list.
     *
     * @return the user list
     */
    @Select("SELECT * FROM cart")
    public List<Cart> getCartList();

    /**
     * Add int.
     *
     * @param cart the cart
     * @return the int
     */
    @Insert("insert into cart(id,productid,productnum) values(#{id},#{productId},#{productNum})")
    public int add(Cart cart);

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    @Delete("delete from cart where id=#{id}")
    public int delete(int id);

    /**
     * Update int.
     *
     * @param id  the id
     * @param num the num
     * @return the int
     */
    @Update("update cart set productnum=#{num} where" +
            " id=#{id}")
    public int update(@Param("id") int id, @Param("num") int num);
}
