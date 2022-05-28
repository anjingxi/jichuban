package com.itheima.opp;


public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.biancheng();
        s.studay();
        System.out.println(s);
        System.out.println(s.age);
        System.out.println(s.gender);
        System.out.println(s.name);
        s.name = "迪迦";
        s.age = 5000000;
        s.gender = "奥特曼";
        System.out.println(s);
        System.out.println(s.age);
        System.out.println(s.gender);
        System.out.println(s.name);

    }
}
