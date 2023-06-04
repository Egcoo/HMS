package com.apple.hotel.service.impl;

import com.apple.hotel.pojo.DishOrder;
import com.apple.hotel.service.DishService;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:30
 */
public class DishServiceImpl implements DishService {
    @Override
    public boolean addDish(DishOrder dishOrder) {
        return false;
    }

    @Override
    public boolean removeDish(Integer dishId) {
        return false;
    }

    @Override
    public boolean updateDish(DishOrder dishOrder) {
        return false;
    }

    @Override
    public DishOrder getDishDetails(Integer dishId) {
        return null;
    }

    @Override
    public List<DishOrder> getDishList() {
        return null;
    }

    @Override
    public List<DishOrder> getDishesByCategory(String category) {
        return null;
    }

    //@Override
    //public boolean addDishToMenu(Integer menuId, Integer dishId) throws IOException {
    //    SqlSession sqlSession = SqlSessionUtil.openSqlSession();
    //    try {
    //        int rowsAffected = DishOrderMapper.addDishToMenu(menuId, dishId);
    //        return rowsAffected > 0;
    //    } catch (Exception e) {
    //        logger.error("Failed to add dish {} to menuId: {}", dishId, menuId, e);
    //        return false;
    //    } finally {
    //        sqlSession.commit();
    //        SqlSessionUtil.closeSqlSession(sqlSession);
    //    }
    //}
    //
    //@Override
    //public boolean removeDishFromDishOrder(Integer menuId, Integer dishId) throws IOException {
    //    SqlSession sqlSession = SqlSessionUtil.openSqlSession();
    //    try {
    //        int rowsAffected = menuMapper.removeDishFromMenu(menuId, dishId);
    //        return rowsAffected > 0;
    //    } catch (Exception e) {
    //        logger.error("Failed to remove dish {} from menuId: {}", dishId, menuId, e);
    //        return false;
    //    } finally {
    //        sqlSession.commit();
    //        SqlSessionUtil.closeSqlSession(sqlSession);
    //    }
    //}
}
