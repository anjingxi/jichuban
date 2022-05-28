package com.itheima.test;


/**
 * @author ly
 *
 */
public class Test03 {
    public static void main(String[] args) {
        int max = getMax(10, 50);
        System.out.println(max);
    }
    public static int getMax(int a, int b){
        //return a>b?a:b;
        return Math.max(a,b);
    }
}
