package com.itheima.test;

public class Singer {
    private String name;
    private  int age;
    private String masterpiece;
    private int price;

    public Singer() {
    }

    public Singer(String name, int age, String masterpiece, int price) {
        this.name = name;
        this.age = age;
        this.masterpiece = masterpiece;
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

    public String getMasterpiece() {
        return masterpiece;
    }

    public void setMasterpiece(String masterpiece) {
        this.masterpiece = masterpiece;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", masterpiece='" + masterpiece + '\'' +
                ", price=" + price +
                '}';
    }
}
