package com.itheima.test;

public class Doctor {
    private String name;
    private int age;
    private String ability;
    private String department;

    public Doctor() {
    }

    public Doctor(String name, int age, String ability, String department) {
        this.name = name;
        this.age = age;
        this.ability = ability;
        this.department = department;
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

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ability='" + ability + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
