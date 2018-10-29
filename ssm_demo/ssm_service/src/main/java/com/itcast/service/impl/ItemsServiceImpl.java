package com.itcast.service.impl;

import com.itcast.service.ItemsService;
import com.itcast.dao.ItemsDao;
import com.itcast.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao dao;

    public Items findById(Integer id) {
        return dao.findById(id);
    }
}
