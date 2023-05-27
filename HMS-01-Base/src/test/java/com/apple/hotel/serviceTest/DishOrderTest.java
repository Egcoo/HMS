package com.apple.hotel.serviceTest;

import com.apple.hotel.pojo.DishOrder;
import org.junit.Test;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/28 - 0:02
 */
public class DishOrderTest {

    /**
     * 添加菜品
     *
     * @param dishOrder
     * @return
     */
    @Test
    boolean addDishTest(DishOrder dishOrder) {
        return false;
    }

    /**
     * 删除菜品
     *
     * @param dishId
     * @return
     */
    @Test
    boolean removeDishTest(Integer dishId) {
        return false;
    }

    /**
     * 更新菜品信息
     *
     * @param dishOrder
     * @return
     */
    @Test
    boolean updateDishTest(DishOrder dishOrder) {
        return false;
    }

    /**
     * 获取菜品详情
     *
     * @param dishId
     * @return
     */
    @Test
    DishOrder getDishDetailsTest(Integer dishId) {
        return null;
    }

    /**
     * 获取菜品列表
     *
     * @return
     */
    @Test
    List<DishOrder> getDishListTest() {
        return null;
    }

    /**
     * 根据菜品类别获取菜品列表
     *
     * @param category
     * @return
     */
    @Test
    List<DishOrder> getDishesByCategoryTest(String category) {
        return null;
    }


}
