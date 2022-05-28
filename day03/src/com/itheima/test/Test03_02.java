package com.itheima.test;

/**
 * 循环累加1-100
 * 1-5
 */
public class Test03_02 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);

        int sum1 = 0;
        for (int i = 0; i <= 5; i++) {
        sum1+=i;

        }
        System.out.println(sum1);
    }
}
