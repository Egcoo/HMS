package com.apple.hotel.service.impl;

import com.apple.hotel.mapper.ManagerMapper;
import com.apple.hotel.pojo.Manager;
import com.apple.hotel.service.ManagerService;
import com.apple.hotel.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:30
 */
public class ManagerServiceImpl implements ManagerService {


    private static final Logger logger = LoggerFactory.getLogger(ManagerServiceImpl.class);
    private ManagerMapper managerMapper = SqlSessionUtil.openSqlSession().getMapper(ManagerMapper.class);
    ;

    public ManagerServiceImpl() throws IOException {

    }

    @Override
    public boolean addEmployee(Manager manager) throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        try {
            int rowsAffected = managerMapper.insertEmployee(manager);
            return rowsAffected > 0;
        } catch (Exception e) {
            logger.error("Failed to add employee: " + e.getMessage());
            return false;
        }

    }

    @Override
    public boolean removeEmployee(Integer managerId) {
        try {
            int rowsAffected = managerMapper.deleteEmployee(managerId);
            return rowsAffected > 0;
        } catch (Exception e) {
            logger.error("Failed to remove employee: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateEmployee(Integer managerId) {
        try {
            int rowsAffected = managerMapper.updateEmployee(managerId);
            return rowsAffected > 0;
        } catch (Exception e) {
            logger.error("Failed to update employee: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Manager getEmployeeDetails(Integer managerId) {
        try {
            return managerMapper.getEmployeeById(managerId);
        } catch (Exception e) {
            logger.error("Failed to retrieve employee details: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Manager getEmployeeDetailsByName(String managerName) {
        try {
            return managerMapper.getEmployeeByName(managerName);
        } catch (Exception e) {
            logger.error("Failed to retrieve employee details: " + e.getMessage());
            return null;
        }
    }


    @Override
    public List<Manager> getEmployeeList() {
        try {
            return managerMapper.getAllEmployees();
        } catch (Exception e) {
            logger.error("Failed to retrieve employee list: " + e.getMessage());
            return null;
        }
    }
}
