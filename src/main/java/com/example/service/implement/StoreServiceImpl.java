package com.example.service.implement;

import com.example.bean.Store;
import com.example.mapper.StoreMapper;
import com.example.service.declaration.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Store service.
 * @author pc
 */
@Service
public class StoreServiceImpl implements StoreService {
    private final StoreMapper storeMapper;

    public StoreServiceImpl(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    /**
     * Gets store list.
     *
     * @return the store list
     */
    @Override
    public List<Store> getStoreList() {
        return storeMapper.getStoreList();
    }
}
