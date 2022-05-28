package com.itheima;
//单行注释ctrl /
//多行注释Ctrl shift /


/**
 * @author ly
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        long star = System.currentTimeMillis();
        System.out.println(star);
        int n = 10000;
        for (int i = 0; i <n ; i++) {
            System.out.println(i);

        }
        long end = System.currentTimeMillis();

        System.out.println(end-star);
        int a =10;
        int b = 20;
        int i = Math.multiplyExact(a, b);
        System.out.println(i);
        System.out.println("---------------");
        var c = 100;

        System.out.println(c);


    }
}
