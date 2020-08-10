package com.example.controller;

import com.example.bean.Cart;
import com.example.bean.JsonResult;
import com.example.bean.User;
import com.example.service.declaration.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Cart controller.
 * @author pc
 */
@RestController
public class CartController {
    private final CartService cartService;

    /**
     * Instantiates a new Cart controller.
     *
     * @param cartService the cart service
     */
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    /**
     * Gets user list.
     *
     * @return the user list
     */
    @RequestMapping(value = "cart/query", method = RequestMethod.GET)
    public List<Cart> getUserList() {
        try {
            return cartService.getCartList();
        } catch (Exception e) {
            System.out.println("getCartList failed!" + e.getMessage());
        }
        return null;
    }

    /**
     * Add response entity.
     *
     * @param cart the cart
     * @return the response entity
     */
    @RequestMapping(value = "cart/add", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add(@RequestBody Cart cart) {
        JsonResult jsonResult = new JsonResult();
        try {
            int orderId = cartService.add(cart);
            if (orderId < 0) {
                jsonResult.setResult(orderId);
                jsonResult.setStatus("failed");
            } else {
                jsonResult.setResult(orderId);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
            jsonResult.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);
    }

    /**
     * Delete response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @RequestMapping(value = "cart/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<JsonResult> delete(@PathVariable(value = "id") int id) {
        JsonResult jsonResult = new JsonResult();
        try {
            int delId = cartService.delete(id);
            if (delId < 0) {
                jsonResult.setResult(delId);
                jsonResult.setStatus("failed");
            } else {
                jsonResult.setResult(delId);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
            jsonResult.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);
    }


    /**
     * Update response entity.
     *
     * @param id  the id
     * @param num the num
     * @return the response entity
     */
    @RequestMapping(value = "cart/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(@PathVariable(value = "id") int id, @RequestBody int num) {
        JsonResult jsonResult = new JsonResult();
        try {
            int orderId = cartService.update(id, num);
            if (orderId < 0) {
                jsonResult.setResult(orderId);
                jsonResult.setStatus("fail");
            } else {
                jsonResult.setResult(orderId);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
            jsonResult.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);
    }
}
