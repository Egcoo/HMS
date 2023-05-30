package com.apple.hotel.serviceTest;

import com.apple.hotel.mapper.ManagerMapper;
import com.apple.hotel.pojo.Manager;
import com.apple.hotel.service.impl.ManagerServiceImpl;
import com.apple.hotel.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
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
    ManagerMapper managerMapper;

    @Test
    public void addEmployeeTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        ManagerServiceImpl managerService = null;
        managerService = new ManagerServiceImpl();
        Manager manager = new Manager(null, "6668665", "123456", "伊文斯", "服务员");
        boolean addEmployee = managerService.addEmployee(manager);
        System.out.println(addEmployee);
        sqlSession.commit();
        sqlSession.close();

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
