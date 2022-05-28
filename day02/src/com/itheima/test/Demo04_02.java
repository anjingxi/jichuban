package com.itheima.test;

public class Demo04_02 {
    public static void main(String[] args) {
        int a = 165;
        int b = 190;
        int c = 600;
        int i = a > b ? a : b;
        int max1 = i > c ? i : c;
        System.out.println(max1);

        System.out.println("-------------------");

        int max2 = Math.max(a, b);
        int superMax = Math.max(max2, c);
        System.out.println(superMax);

        System.out.println("-------------------");

        int maxSanYuan = a > b && a > c ? a : b > c ? b : c;
        System.out.println(maxSanYuan);


    }
}
