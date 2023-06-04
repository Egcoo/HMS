package com.apple.hotel.mapper;

public interface DishOrderMapper {


    int removeDishFromMenu(Integer menuId, Integer dishId);

    int addDishToMenu(Integer menuId, Integer dishId);
}