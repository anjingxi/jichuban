package com.itheima.test;

/**
 * 珠峰8848.86
 * 一张纸0.1
 * 需要折叠多少次能超过珠峰
 */
public class Test06_02 {
    public static void main(String[] args) {
        int count =0;
        double paper =0.1;
        double zf =8848860;
         while (paper<zf){
             paper*=2;
             count++;
         }
        System.out.println(count);

    }
}
