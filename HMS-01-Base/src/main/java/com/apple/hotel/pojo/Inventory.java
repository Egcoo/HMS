package com.apple.hotel.pojo;

public class Inventory {
    private String inventoryId;

    private String dishId;

    private Integer quantity;

    private Integer threshold;


    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId='" + inventoryId + '\'' +
                ", dishId='" + dishId + '\'' +
                ", quantity=" + quantity +
                ", threshold=" + threshold +
                '}';
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId == null ? null : inventoryId.trim();
    }

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId == null ? null : dishId.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }
}