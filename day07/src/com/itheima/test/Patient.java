package com.itheima.test;

public class Patient {
    private String name ;
    private int age;
    private String add;
    private String sick;

    public Patient() {
    }

    public Patient(String name, int age, String add, String sick) {
        this.name = name;
        this.age = age;
        this.add = add;
        this.sick = sick;
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getSick() {
        return sick;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", sick='" + sick + '\'' +
                '}';
    }
}
