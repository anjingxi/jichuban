package com.itheima.yuxi;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone("华为",2999);
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        p.call();
        p.setMassage();
        System.out.println("===========================");
        Phone i = new Iphone();
        i.setName("苹果手机");
        i.setPrice(9999);
        i.setMassage();
        i.call();
        System.out.println(i.getPrice());
        System.out.println(i.getName());
        System.out.println("=============================");
        Iphone ip = new Iphone();
        ip.setName("苹果手机一二三");
        ip.setPrice(12343);
        ip.photoGraph();
        System.out.println(ip.getName());
        System.out.println(ip.getPrice());
        ip.setMassage();
        ip.call();

    }
}
