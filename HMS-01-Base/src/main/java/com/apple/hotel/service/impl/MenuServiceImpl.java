package com.apple.hotel.service.impl;

import com.apple.hotel.mapper.MenuMapper;
import com.apple.hotel.pojo.Menu;
import com.apple.hotel.service.MenuService;
import com.apple.hotel.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;
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
    public boolean addMenu(Menu menu) throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        try {
            int rowsAffected = menuMapper.addMenu(menu);
            return rowsAffected > 0;
        } catch (Exception e) {
            logger.error("Failed to add menu: {}", menu, e);
            return false;
        } finally {
            sqlSession.commit();
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
    }

    @Override
    public boolean delMenu(String name) throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        try {
            int rowsAffected = menuMapper.delMenu(name);
            return rowsAffected > 0;
        } catch (Exception e) {
            logger.error("Failed to delete menu: {}", name, e);
            return false;
        } finally {
            sqlSession.commit();
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
    }


    @Override
    public boolean updateMenu(Menu menu) throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        try {
            int rowsAffected = menuMapper.updateMenu(menu);
            return rowsAffected > 0;
        } catch (Exception e) {
            logger.error("Failed to update menu: {}", menu, e);
            return false;
        } finally {
            sqlSession.commit();
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
    }

    @Override
    public Menu getMenuDetailsById(Integer menuId) throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        try {
            return menuMapper.getMenuById(menuId);
        } catch (Exception e) {
            logger.error("Failed to get menu details for menuId: {}", menuId, e);
            return null;
        } finally {
            sqlSession.commit();
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
    }

    @Override
    public Menu getMenuDetailsByName(String name) throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        try {
            return menuMapper.getMenuByName(name);
        } catch (Exception e) {
            logger.error("Failed to get menu details for name: {}", name, e);
            return null;
        } finally {
            sqlSession.commit();
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
    }


    @Override
    public List<Menu> getMenuList() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        try {
            return menuMapper.getAllMenus();
        } catch (Exception e) {
            logger.error("Failed to get menu list", e);
            return Collections.emptyList();
        } finally {
            sqlSession.commit();
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
    }


}
