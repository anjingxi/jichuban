package com.itheima.yuxi;

public class Phone {
    private String name ;
    private double price;

    public Phone() {
    }

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public void call(){
        System.out.println("打电话");
    }
    public void setMassage(){
        System.out.println("发短信");
    }

}
