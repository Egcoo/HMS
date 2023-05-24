package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Bill;
import com.apple.hotel.pojo.BillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {
    long countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bill row);

    int insertSelective(Bill row);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Bill row, @Param("example") BillExample example);

    int updateByExample(@Param("row") Bill row, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill row);

    int updateByPrimaryKey(Bill row);
}