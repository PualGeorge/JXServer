package com.example.service.declaration;

import com.example.bean.Store;


import java.util.List;

/**
 * The interface Store service.
 * @author pc
 */
public interface StoreService {
    /**
     * Gets store list.
     *
     * @return the store list
     */
    public List<Store> getStoreList();
}
