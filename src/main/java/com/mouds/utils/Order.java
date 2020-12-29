package com.mouds.utils;

public class Order {
    private String name;
    private String address;
    private String peoP;
    private String data;

    public Order(String name, String address, String peoP, String data) {
        this.name = name;
        this.address = address;
        this.peoP = peoP;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", peoP='" + peoP + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPeoP() {
        return peoP;
    }

    public void setPeoP(String peoP) {
        this.peoP = peoP;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
