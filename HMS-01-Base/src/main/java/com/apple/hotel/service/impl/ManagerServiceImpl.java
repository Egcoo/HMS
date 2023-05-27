package com.apple.hotel.service.impl;

import com.apple.hotel.pojo.Manager;
import com.apple.hotel.service.ManagerService;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:30
 */
public class ManagerServiceImpl implements ManagerService {
    @Override
    public boolean addEmployee(Manager manager) {
        return false;
    }

    @Override
    public boolean removeEmployee(Integer managerId) {
        return false;
    }

    @Override
    public boolean updateEmployee(Manager manager) {
        return false;
    }

    @Override
    public Manager getEmployeeDetails(Integer managerId) {
        return null;
    }

    @Override
    public List<Manager> getEmployeeList() {
        return null;
    }
}
