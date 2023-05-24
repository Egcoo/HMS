package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Manager;
import com.apple.hotel.pojo.ManagerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerMapper {
    long countByExample(ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Manager row);

    int insertSelective(Manager row);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Manager row, @Param("example") ManagerExample example);

    int updateByExample(@Param("row") Manager row, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager row);

    int updateByPrimaryKey(Manager row);
}