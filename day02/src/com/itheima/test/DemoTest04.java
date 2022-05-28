package com.itheima.test;


public class DemoTest04 {
    public static void main(String[] args) {

        int max1 = max(165, 170, 210);
        System.out.println(max1);

    }
    public static int max(int a,int b, int  c){
        return a>b&&a>c?a: Math.max(b, c);
    }


}

