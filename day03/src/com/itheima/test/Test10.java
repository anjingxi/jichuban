package com.itheima.test;

import java.util.Random;

/**
 * 使用Random生成一个1到5之间的随机数并打印
 */
public class Test10 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int a = r.nextInt(5)+1;
            System.out.println(a);


        }

    }
}
