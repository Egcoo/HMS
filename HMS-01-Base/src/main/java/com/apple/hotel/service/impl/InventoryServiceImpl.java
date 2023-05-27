package com.apple.hotel.service.impl;

import com.apple.hotel.pojo.Inventory;
import com.apple.hotel.service.InventoryService;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:31
 */
public class InventoryServiceImpl implements InventoryService {
    @Override
    public boolean updateInventory(Integer dishId, Integer quantity) {
        return false;
    }

    @Override
    public Inventory getInventoryDetails(Integer dishId) {
        return null;
    }

    @Override
    public List<Inventory> getInventoryList() {
        return null;
    }
}
