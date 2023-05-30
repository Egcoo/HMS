package com.apple.hotel.service.impl;

import com.apple.hotel.mapper.MenuMapper;
import com.apple.hotel.pojo.Menu;
import com.apple.hotel.service.MenuService;
import com.apple.hotel.utils.SqlSessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:31
 */
public class MenuServiceImpl implements MenuService {

    private static final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
    private MenuMapper menuMapper = SqlSessionUtil.openSqlSession().getMapper(MenuMapper.class);

    public MenuServiceImpl() throws IOException {

    }

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
