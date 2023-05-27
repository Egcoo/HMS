package com.apple.hotel.serviceTest;

import com.apple.hotel.pojo.Order;
import org.junit.Test;

import java.util.List;

/**
 * @ author Egcoo
 * @ date 2023/5/28 - 0:01
 */
public class OrderTest {

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    @Test
    public boolean createOrderTest(Order order) {
        return true;
    }

    /**
     * 取消订单
     *
     * @param orderId
     * @return
     */
    @Test
    public boolean cancelOrderTest(Integer orderId) {
        return true;
    }

    /**
     * 获取订单详情
     *
     * @param orderId
     * @return
     */
    @Test
    Order getOrderDetailsTest(Integer orderId) {
        return null;
    }

    /**
     * 获取订单列表
     *
     * @return
     */
    @Test
    List<Order> getOrderListTest() {
        return null;
    }

    /**
     * 根据顾客名称获取订单列表
     *
     * @param customerName
     * @return
     */
    @Test
    List<Order> getOrdersByCustomerTest(String customerName) {
        return null;
    }
}
