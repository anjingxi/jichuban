package com.itheima.test;

public class Merchant {
    private String name ;
    private int age ;
    private String food;
    private double price;

    public Merchant() {

    }

    public Merchant(String name, int age, String food, double price) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                ", price=" + price +
                '}';
    }
}
