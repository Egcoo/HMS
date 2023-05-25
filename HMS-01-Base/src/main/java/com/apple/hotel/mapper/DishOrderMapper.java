package com.apple.hotel.mapper;

import com.apple.hotel.pojo.DishOrder;
import com.apple.hotel.pojo.DishOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DishOrderMapper {
    long countByExample(DishOrderExample example);

    int deleteByExample(DishOrderExample example);

    int deleteByPrimaryKey(Integer dishOrderId);

    int insert(DishOrder row);

    int insertSelective(DishOrder row);

    List<DishOrder> selectByExample(DishOrderExample example);

    DishOrder selectByPrimaryKey(Integer dishOrderId);

    int updateByExampleSelective(@Param("row") DishOrder row, @Param("example") DishOrderExample example);

    int updateByExample(@Param("row") DishOrder row, @Param("example") DishOrderExample example);

    int updateByPrimaryKeySelective(DishOrder row);

    int updateByPrimaryKey(DishOrder row);
}