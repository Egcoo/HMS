package com.apple.hotel.serviceTest;

import com.apple.hotel.pojo.Menu;
import org.junit.Test;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/28 - 0:01
 */
public class MenuTest {

    /**
     * 添加菜品
     *
     * @param menu
     * @return
     */
    @Test
    public boolean addMenuTest(Menu menu) {
        return true;
    }

    /**
     * 更新菜品详情
     *
     * @param menu
     * @return
     */
    @Test
    boolean updateMenu(Menu menu) {
        return true;
    }

    /**
     * 获取单个菜品详情
     *
     * @param menuId
     * @return
     */
    @Test
    public Menu getMenuDetailsTest(Integer menuId) {
        return null;
    }

    /**
     * 获取菜单列表
     *
     * @return
     */
    @Test
    List<Menu> getMenuListTest() {
        return null;
    }

    /**
     * 将菜品添加到菜品订单中
     *
     * @param menuId
     * @param dishId
     */
    @Test
    public void addDishToMenuTest(Integer menuId, Integer dishId) {

    }

    /**
     * 从菜单中移除菜品
     *
     * @param menuId
     * @param dishId
     */
    @Test
    public void removeDishFromMenuTest(Integer menuId, Integer dishId) {

    }
}
