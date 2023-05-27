package com.apple.hotel.service;

import com.apple.hotel.pojo.Order;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/25 - 14:24
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    boolean createOrder(Order order);

    /**
     * 取消订单
     *
     * @param orderId
     * @return
     */
    boolean cancelOrder(Integer orderId);

    /**
     * 获取订单详情
     *
     * @param orderId
     * @return
     */
    Order getOrderDetails(Integer orderId);

    /**
     * 获取订单列表
     *
     * @return
     */
    List<Order> getOrderList();

    /**
     * 根据顾客名称获取订单列表
     *
     * @param customerName
     * @return
     */
    List<Order> getOrdersByCustomer(String customerName);

}
