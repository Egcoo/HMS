package com.apple.hotel.pojo;

public class DishOrder {
    private Integer dishOrderId;

    private Integer orderId;

    private Integer dishId;

    private Integer quantity;

    private String specialRequest;

    public DishOrder() {
    }

    public DishOrder(Integer dishOrderId, Integer orderId, Integer dishId, Integer quantity, String specialRequest) {
        this.dishOrderId = dishOrderId;
        this.orderId = orderId;
        this.dishId = dishId;
        this.quantity = quantity;
        this.specialRequest = specialRequest;
    }

    @Override
    public String toString() {
        return "DishOrder{" +
                "dishOrderId=" + dishOrderId +
                ", orderId=" + orderId +
                ", dishId=" + dishId +
                ", quantity=" + quantity +
                ", specialRequest='" + specialRequest + '\'' +
                '}';
    }

    public Integer getDishOrderId() {
        return dishOrderId;
    }

    public void setDishOrderId(Integer dishOrderId) {
        this.dishOrderId = dishOrderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest == null ? null : specialRequest.trim();
    }
}