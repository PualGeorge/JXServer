package com.example.controller;

import com.example.bean.Store;
import com.example.service.declaration.StoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Store controller.
 * @author pc
 */
@RestController
public class StoreController {
    private final StoreService storeService;

    /**
     * Instantiates a new Store controller.
     *
     * @param storeService the store service
     */
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    /**
     * Gets user list.
     *
     * @return the user list
     */
    @RequestMapping(value = "store/query", method = RequestMethod.GET)
    public List<Store> getUserList() {
        try {
            return storeService.getStoreList();
        } catch (Exception e) {
            System.out.println("getStoreList failed!" + e.getMessage());
        }
        return null;
    }
}
