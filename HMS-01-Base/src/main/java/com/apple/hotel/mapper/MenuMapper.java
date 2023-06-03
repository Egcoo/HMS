package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Menu;

import java.util.List;

public interface MenuMapper {

    int addMenu(Menu menu);

    int delMenu(Integer id);

    int updateMenu(Menu menu);


    Menu getMenuById(Integer menuId);

    List<Menu> getAllMenus();


    int removeDishFromMenu(Integer menuId, Integer dishId);

    int addDishToMenu(Integer menuId, Integer dishId);
}