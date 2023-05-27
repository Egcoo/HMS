package com.apple.hotel.service;

import com.apple.hotel.pojo.Menu;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:25
 */
public interface MenuService {

    /**
     * 添加菜品
     *
     * @param menu
     * @return
     */
    boolean addMenu(Menu menu);

    /**
     * 更新菜品详情
     *
     * @param menu
     * @return
     */
    boolean updateMenu(Menu menu);

    /**
     * 获取单个菜品详情
     *
     * @param menuId
     * @return
     */
    Menu getMenuDetails(Integer menuId);

    /**
     * 获取菜单列表
     *
     * @return
     */
    List<Menu> getMenuList();

    /**
     * 将菜品添加到菜品订单中
     *
     * @param menuId
     * @param dishId
     */
    void addDishToMenu(Integer menuId, Integer dishId);

    /**
     * 从菜单中移除菜品
     *
     * @param menuId
     * @param dishId
     */
    void removeDishFromMenu(Integer menuId, Integer dishId);
}
