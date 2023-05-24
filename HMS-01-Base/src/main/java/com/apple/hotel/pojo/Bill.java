package com.apple.hotel.pojo;

import java.util.Date;

public class Bill {
    private Integer id;

    private String billId;

    private Integer menuId;

    private Short nums;

    private Double money;

    private Integer diningtableId;

    private Date billDate;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Short getNums() {
        return nums;
    }

    public void setNums(Short nums) {
        this.nums = nums;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getDiningtableId() {
        return diningtableId;
    }

    public void setDiningtableId(Integer diningtableId) {
        this.diningtableId = diningtableId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}