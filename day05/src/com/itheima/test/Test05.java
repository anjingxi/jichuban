package com.itheima.test;

public class Test05 {
    public static void main(String[] args) {
        int [] arr ={11,2,33,444,56,643,24543,3426426,24365245};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max= arr[0];
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }
}
