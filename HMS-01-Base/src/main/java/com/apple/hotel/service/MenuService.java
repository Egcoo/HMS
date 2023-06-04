package com.apple.hotel.service;

import com.apple.hotel.pojo.Menu;

import java.io.IOException;
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
    boolean addMenu(Menu menu) throws IOException;

    /**
     * 删除菜品
     *
     * @param name
     * @return
     * @throws IOException
     */
    boolean delMenu(String name) throws IOException;

    /**
     * 更新菜品详情
     *
     * @param menu
     * @return
     */
    boolean updateMenu(Menu menu) throws IOException;

    /**
     * 获取单个菜品详情
     *
     * @param menuId
     * @return
     */
    Menu getMenuDetailsById(Integer menuId) throws IOException;

    /**
     * 通过名字查菜品详情
     *
     * @param name
     * @return
     * @throws IOException
     */
    Menu getMenuDetailsByName(String name) throws IOException;

    /**
     * 获取菜单列表
     *
     * @return
     */
    List<Menu> getMenuList() throws IOException;


    /**
     * 将菜品添加到菜品订单中
     *
     * @param menuId
     * @param dishId
     */
    //boolean addDishToMenu(Integer menuId, Integer dishId) throws IOException;

    /**
     * 从菜单订单中移除菜品
     *
     * @param menuId
     * @param dishId
     */
    //boolean removeDishFromMenu(Integer menuId, Integer dishId) throws IOException;

}
