package com.apple.hotel.service;

import com.apple.hotel.pojo.DishOrder;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:26
 */
public interface DishService {

    /**
     * 添加菜品
     *
     * @param dishOrder
     * @return
     */
    boolean addDish(DishOrder dishOrder);

    /**
     * 删除菜品
     *
     * @param dishId
     * @return
     */
    boolean removeDish(Integer dishId);

    /**
     * 更新菜品信息
     *
     * @param dishOrder
     * @return
     */
    boolean updateDish(DishOrder dishOrder);

    /**
     * 获取菜品详情
     *
     * @param dishId
     * @return
     */
    DishOrder getDishDetails(Integer dishId);

    /**
     * 获取菜品列表
     *
     * @return
     */
    List<DishOrder> getDishList();

    /**
     * 根据菜品类别获取菜品列表
     *
     * @param category
     * @return
     */
    List<DishOrder> getDishesByCategory(String category);
}
