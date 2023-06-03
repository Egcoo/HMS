package com.apple.hotel.serviceTest;

import com.apple.hotel.pojo.Manager;
import com.apple.hotel.service.impl.ManagerServiceImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.List;


/**
 * @ author Egcoo
 * @ date 2023/5/28 - 0:01
 */
public class ManagerTest {

    /**
     * 添加员工
     */

    @Test
    public void addEmployeeTest() throws IOException {
        ManagerServiceImpl managerService = null;
        managerService = new ManagerServiceImpl();
        Manager manager = new Manager(null, "6668771", "123456", "申玉菲", "服务员");
        boolean addEmployee = managerService.addEmployee(manager);
        System.out.println(addEmployee);
    }

    /**
     * 删除员工
     *
     * @param
     * @return
     */
    @Test
    public void removeEmployeeTest() throws IOException {
        ManagerServiceImpl managerService = null;
        managerService = new ManagerServiceImpl();
        boolean removeEmployee = managerService.removeEmployee("6668665");
        System.out.println(removeEmployee);
    }

    /**
     * 更新员工信息
     *
     * @return
     */
    @Test
    public void updateEmployeeTest() throws IOException {
        ManagerServiceImpl managerService = null;
        managerService = new ManagerServiceImpl();
        Manager manager = new Manager(null, "6668775", "123456", "杨冬", "物理学家");
        boolean updateEmployee = managerService.updateEmployee(manager);
        System.out.println(updateEmployee);

    }

    /**
     * 获取员工详情
     *
     * @param
     * @return
     */
    @Test
    public void getEmployeeDetailsTest() throws IOException {
        ManagerServiceImpl managerService = null;
        managerService = new ManagerServiceImpl();
        Manager manager = managerService.getEmployeeDetailsById("6668775");
        System.out.println(manager);
    }

    /**
     * 获取员工详情
     *
     * @param
     * @return
     */
    @Test
    public void getEmployeeDetailsByNameTest() throws IOException {
        ManagerServiceImpl managerService = null;
        managerService = new ManagerServiceImpl();
        Manager manager = managerService.getEmployeeDetailsByName("杨冬");
        System.out.println(manager);
    }

    /**
     * 获取员工列表
     *
     * @return
     */
    @Test
    public void getEmployeeListTest() throws IOException {
        ManagerServiceImpl managerService = null;
        managerService = new ManagerServiceImpl();
        List<Manager> managerList = managerService.getEmployeeList();
        System.out.println(managerList);
    }
}
