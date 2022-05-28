package com.itheima.test;

public class Hospital {
    private String name ;
    private String add;
    private int age;
    private boolean technology;

    public Hospital() {
    }

    public Hospital(String name, String add, int age, boolean technology) {
        this.name = name;
        this.add = add;
        this.age = age;
        this.technology = technology;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTechnology() {
        return technology;
    }

    public void setTechnology(boolean technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", age=" + age +
                ", technology=" + technology +
                '}';
    }
}
