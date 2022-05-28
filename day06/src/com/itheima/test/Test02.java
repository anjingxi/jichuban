package com.itheima.test;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] brr = new int[arr.length];
        int l = arr.length - 1;
        for (int i : arr) {
            brr[l] = i;
            l--;
        }
        System.out.println(Arrays.toString(brr));
        arr = brr;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
}
