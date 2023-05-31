package com.apple.hotel.serviceTest;

import com.apple.hotel.pojo.Manager;
import com.apple.hotel.service.impl.ManagerServiceImpl;
import org.junit.Test;

import java.io.IOException;


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
    public void removeEmployeeTest() {

    }

    /**
     * 更新员工信息
     *
     * @return
     */
    @Test
    public void updateEmployeeTest() {

    }

    /**
     * 获取员工详情
     *
     * @param
     * @return
     */
    @Test
    public void getEmployeeDetailsTest() {
    }

    /**
     * 获取员工列表
     *
     * @return
     */
    @Test
    public void getEmployeeListTest() {

    }
}
