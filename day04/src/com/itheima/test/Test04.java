package com.itheima.test;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = {11,16,15,99,88,75,46,14};
        String s = Arrays.toString(arr);
        System.out.println(s);
        int max = 0;
        int max1 =0;
        for (int j : arr) {
            max = Math.max(max, j);
        }
        System.out.println(max);
        for (int i : arr) {
            max1= Math.max(max1, i);

        }
        System.out.println(max1);
    }
}
