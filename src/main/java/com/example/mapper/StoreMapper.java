package com.example.mapper;

import com.example.bean.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Store mapper.
 * @author pc
 */
@Mapper
@Component
public interface StoreMapper {
    /**
     * Gets user list.
     *
     * @return the user list
     */
    @Select("SELECT * FROM storeinfo")
    public List<Store> getStoreList();

}
