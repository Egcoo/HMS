package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Manager;

import java.util.List;

/**
 * @author Egcoo
 */
public interface ManagerMapper {

    int insertEmployee(Manager manager);

    int deleteEmployee(Integer managerid);

    int updateEmployee(Integer managerid);

    Manager getEmployeeById(Integer id);

    Manager getEmployeeByName(String name);

    List<Manager> getAllEmployees();
}