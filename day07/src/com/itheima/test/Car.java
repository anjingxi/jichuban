package com.itheima.test;

public class Car {
    private String name;
    private double price;
    private String color;
    private boolean isElectricity;

    public Car() {
    }

    public Car(String name, double price, String color, boolean isElectricity) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.isElectricity = isElectricity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isElectricity() {
        return isElectricity;
    }

    public void setElectricity(boolean electricity) {
        isElectricity = electricity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isElectricity=" + isElectricity +
                '}';
    }
}
