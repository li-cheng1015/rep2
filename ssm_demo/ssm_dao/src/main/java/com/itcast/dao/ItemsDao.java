package com.itcast.dao;

import com.itcast.domain.Items;
import org.springframework.stereotype.Repository;

@Repository("itemsDao")
public interface ItemsDao {
    Items findById(Integer id);
}
