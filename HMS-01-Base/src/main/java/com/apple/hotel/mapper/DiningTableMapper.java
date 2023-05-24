package com.apple.hotel.mapper;

import com.apple.hotel.pojo.DiningTable;
import com.apple.hotel.pojo.DiningTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiningTableMapper {
    long countByExample(DiningTableExample example);

    int deleteByExample(DiningTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DiningTable row);

    int insertSelective(DiningTable row);

    List<DiningTable> selectByExample(DiningTableExample example);

    DiningTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") DiningTable row, @Param("example") DiningTableExample example);

    int updateByExample(@Param("row") DiningTable row, @Param("example") DiningTableExample example);

    int updateByPrimaryKeySelective(DiningTable row);

    int updateByPrimaryKey(DiningTable row);
}