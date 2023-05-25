package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Inventory;
import com.apple.hotel.pojo.InventoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryMapper {
    long countByExample(InventoryExample example);

    int deleteByExample(InventoryExample example);

    int deleteByPrimaryKey(String inventoryId);

    int insert(Inventory row);

    int insertSelective(Inventory row);

    List<Inventory> selectByExample(InventoryExample example);

    Inventory selectByPrimaryKey(String inventoryId);

    int updateByExampleSelective(@Param("row") Inventory row, @Param("example") InventoryExample example);

    int updateByExample(@Param("row") Inventory row, @Param("example") InventoryExample example);

    int updateByPrimaryKeySelective(Inventory row);

    int updateByPrimaryKey(Inventory row);
}