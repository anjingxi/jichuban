package com.itheima.test;

public class Test02 {
    public static void main(String[] args) {
        boolean compare = compare(10, 10);
        byte a = 10;
        byte b = 10;
        boolean compare1 = compare(a, b);
        short c = 10;
        short d = 10;
        boolean compare2 = compare(c, d);
        boolean compare3 = compare(10L, 10L);
        System.out.println(compare);
        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(compare3);
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }
}
