package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Menu;
import com.apple.hotel.pojo.MenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu row);

    int insertSelective(Menu row);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Menu row, @Param("example") MenuExample example);

    int updateByExample(@Param("row") Menu row, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu row);

    int updateByPrimaryKey(Menu row);
}