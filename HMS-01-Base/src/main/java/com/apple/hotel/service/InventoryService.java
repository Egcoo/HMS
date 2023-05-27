package com.apple.hotel.service;

import com.apple.hotel.pojo.Inventory;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:26
 */
public interface InventoryService {

    /**
     * 更新某个原料库存数量
     *
     * @param dishId
     * @param quantity
     * @return
     */
    boolean updateInventory(Integer dishId, Integer quantity);

    /**
     * 获取库存详情
     *
     * @param dishId
     * @return
     */
    Inventory getInventoryDetails(Integer dishId);

    /**
     * 获取库存列表
     *
     * @return
     */
    List<Inventory> getInventoryList();
}
