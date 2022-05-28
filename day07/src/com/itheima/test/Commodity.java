package com.itheima.test;

public class Commodity {
    private String name;
    private int stock ;
    private double price;
    private boolean isHealthy;

    public Commodity() {
    }

    public Commodity(String name, int stock, double price, boolean isHealthy) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", isHealthy=" + isHealthy +
                '}';
    }
}
