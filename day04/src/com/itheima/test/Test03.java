package com.itheima.test;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] arr ={11,22,33,44,55,66,77,88,99};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
        String s = Arrays.toString(arr);
        System.out.println(s);

    }
}
