package com.itheima.test;

/**
 * 遍历水仙花数
 */
public class Test04_02 {
    public static void main(String[] args) {
        int count =1;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i/10 % 10;
            int bai = i/100 % 10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.print(i+" ");
                if(count%2==0){
                    System.out.println();
                }
                count++;
            }

        }
    }
}
