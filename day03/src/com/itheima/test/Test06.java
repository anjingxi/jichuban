package com.itheima.test;

public class Test06 {
    public static void main(String[] args) {
        int count = 0;
        double paper =0.1;
        double zf = 8848860;
        while (paper<zf){
            count++;
            double v = Math.pow(2, count);
           // System.out.println(v);
             paper=0.1*v;
        }
        System.out.println(count);
    }
}
