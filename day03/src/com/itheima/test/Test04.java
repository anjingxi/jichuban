package com.itheima.test;

/**
 * 水仙花数
 *
 * @author ly
 */
public class Test04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double ge3 = Math.pow(ge, 3);
            double shi3 = Math.pow(shi, 3);
            double bai3 = Math.pow(bai, 3);
            double sum = ge3 + shi3 + bai3;
            if (sum == i) {
                if (count % 2 == 0) {
                    System.out.println();
                }
                System.out.print(i + " ");
                count++;
            }


        }

    }
}
