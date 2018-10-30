package com.itcast.dao;

import com.itcast.domain.Items;
import org.springframework.stereotype.Repository;


public interface ItemsDao {
    Items findById(Integer id);
}
