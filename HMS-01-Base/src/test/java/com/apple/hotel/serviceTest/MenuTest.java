package com.apple.hotel.serviceTest;

import com.apple.hotel.pojo.Menu;
import com.apple.hotel.service.impl.MenuServiceImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/28 - 0:01
 */
public class MenuTest {

    /**
     * 添加菜品
     */
    @Test
    public void addMenuTest() throws IOException {
        MenuServiceImpl menuService = new MenuServiceImpl();
        Menu menu = new Menu(9, "东方龙舌兰", "酒类", 30.0);
        boolean addMenu = menuService.addMenu(menu);
        System.out.println(addMenu);
    }

    /**
     * 删除菜品
     *
     * @throws IOException
     */
    @Test
    public void delMenuTest() throws IOException {
        MenuServiceImpl menuService = new MenuServiceImpl();
        boolean delMenu = menuService.delMenu("东方龙舌兰");
        System.out.println(delMenu);
    }

    /**
     * 更新菜品详情
     */
    @Test
    public void updateMenu() throws IOException {
        MenuServiceImpl menuService = new MenuServiceImpl();
        Menu menu = new Menu(9, "东方龙舌兰", "酒类", 35.0);
        boolean updateMenu = menuService.updateMenu(menu);
        System.out.println(updateMenu);
    }

    /**
     * 获取单个菜品详情
     */
    @Test
    public void getMenuDetailsByIdTest() throws IOException {
        MenuServiceImpl menuService = new MenuServiceImpl();
        Menu menu = menuService.getMenuDetailsById(10);
        System.out.println(menu);
    }


    /**
     * 获取单个菜品详情
     */
    @Test
    public void getMenuDetailsByNameTest() throws IOException {
        MenuServiceImpl menuService = new MenuServiceImpl();
        Menu menu = menuService.getMenuDetailsByName("东方龙舌兰");
        System.out.println(menu);
    }

    /**
     * 获取菜单列表
     *
     * @return
     */
    @Test
    public void getMenuListTest() throws IOException {
        MenuServiceImpl menuService = new MenuServiceImpl();
        List<Menu> menuList = menuService.getMenuList();
        System.out.println(menuList);
    }


}
