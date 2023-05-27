package com.apple.hotel.service;

import com.apple.hotel.pojo.Manager;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:26
 */
public interface ManagerService {

    /**
     * 添加员工
     *
     * @param manager
     * @return
     */
    boolean addEmployee(Manager manager);

    /**
     * 删除员工
     *
     * @param managerId
     * @return
     */
    boolean removeEmployee(Integer managerId);

    /**
     * 更新员工信息
     *
     * @param manager
     * @return
     */
    boolean updateEmployee(Manager manager);

    /**
     * 获取员工详情
     *
     * @param managerId
     * @return
     */
    Manager getEmployeeDetails(Integer managerId);

    /**
     * 获取员工列表
     *
     * @return
     */
    List<Manager> getEmployeeList();
}
