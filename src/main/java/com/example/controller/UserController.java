package com.example.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import com.example.bean.JsonResult;
import com.example.bean.User;
import com.example.service.declaration.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type User controller.
 *
 * @author pc
 * @since 2020 /8/8
 */
@RestController
public class UserController {
    private final UserService userService;

    /**
     * Instantiates a new User controller.
     *
     * @param userService the user service
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Gets user by id.
     *
     * @param id the id
     * @return the user
     */
    @GetMapping(value = "user/query/{id}")
    public User getUserById(@PathVariable(value = "id") int id) {
        try {
            return userService.getUserById(id);
        } catch (Exception e) {
            System.out.println("getById failed!" + e.getMessage());
        }
        return null;
    }

    /**
     * Gets user list.
     *
     * @return the user list
     */
    @RequestMapping(value = "user/query", method = RequestMethod.GET)
    public List<User> getUserList() {
        try {
            return userService.getUserList();
        } catch (Exception e) {
            System.out.println("getUserList failed!" + e.getMessage());
        }
        return null;
    }

    /**
     * Add response entity.
     *
     * @param user the user
     * @return the response entity
     */
    @RequestMapping(value = "user/add", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add(@RequestBody User user) {
        JsonResult jsonResult = new JsonResult();
        try {
            int orderId = userService.add(user);
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
     * Update response entity.
     *
     * @param id   the id
     * @param user the user
     * @return the response entity
     */
    @RequestMapping(value = "user/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(@PathVariable(value = "id") int id, @RequestBody User user) {
        JsonResult jsonResult = new JsonResult();
        try {
            int orderId = userService.update(id, user);
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
