package com.apple.hotel.mapper;

import com.apple.hotel.pojo.Manager;

import java.util.List;

/**
 * @author Egcoo
 */
public interface ManagerMapper {

    int insertEmployee(Manager manager);

    int deleteEmployee(String managerid);

    int updateEmployee(Manager manager);

    Manager getEmployeeById(String managerid);

    Manager getEmployeeByName(String name);

    List<Manager> getAllEmployees();
}