package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Menu;

import java.util.List;

public interface MenuMapper {

    int addMenu(Menu menu);

    int delMenu(String name);

    int updateMenu(Menu menu);


    Menu getMenuById(Integer menuId);

    Menu getMenuByName(String name);

    List<Menu> getAllMenus();


}