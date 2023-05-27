package com.apple.hotel.service.impl;

import com.apple.hotel.pojo.Order;
import com.apple.hotel.service.OrderService;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:31
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public boolean createOrder(Order order) {
        return false;
    }

    @Override
    public boolean cancelOrder(Integer orderId) {
        return false;
    }

    @Override
    public Order getOrderDetails(Integer orderId) {
        return null;
    }

    @Override
    public List<Order> getOrderList() {
        return null;
    }

    @Override
    public List<Order> getOrdersByCustomer(String customerName) {
        return null;
    }
}
