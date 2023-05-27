package com.apple.hotel.service.impl;

import com.apple.hotel.pojo.Menu;
import com.apple.hotel.service.MenuService;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:31
 */
public class MenuServiceImpl implements MenuService {
    @Override
    public boolean addMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean updateMenu(Menu menu) {
        return false;
    }

    @Override
    public Menu getMenuDetails(Integer menuId) {
        return null;
    }

    @Override
    public List<Menu> getMenuList() {
        return null;
    }

    @Override
    public void addDishToMenu(Integer menuId, Integer dishId) {

    }

    @Override
    public void removeDishFromMenu(Integer menuId, Integer dishId) {

    }
}
