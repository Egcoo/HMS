package com.apple.hotel.service;

import com.apple.hotel.pojo.Manager;

import java.io.IOException;
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
    boolean addEmployee(Manager manager) throws IOException;

    /**
     * 删除员工
     *
     * @param managerId
     * @return
     */
    boolean removeEmployee(Integer managerId) throws IOException;

    /**
     * 更新员工信息
     *
     * @param managerid
     * @return
     */
    boolean updateEmployee(Integer managerid) throws IOException;

    /**
     * 获取员工详情
     *
     * @param managerId
     * @return
     */
    Manager getEmployeeDetails(Integer managerId) throws IOException;

    /**
     * 根据员工名字获取信息
     *
     * @param managerName
     * @return
     */
    Manager getEmployeeDetailsByName(String managerName) throws IOException;

    /**
     * 获取员工列表
     *
     * @return
     */
    List<Manager> getEmployeeList() throws IOException;
}
