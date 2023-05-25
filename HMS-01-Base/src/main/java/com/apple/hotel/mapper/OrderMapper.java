package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Order;
import com.apple.hotel.pojo.OrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order row);

    int insertSelective(Order row);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("row") Order row, @Param("example") OrderExample example);

    int updateByExample(@Param("row") Order row, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order row);

    int updateByPrimaryKey(Order row);
}