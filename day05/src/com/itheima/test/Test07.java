package com.itheima.test;

public class Test07 {
    public static void main(String[] args) {
        int [] arr ={11,22,22,33,55,99,44,55,44};
        int[] maxAndMin = getMaxAndMin(arr);
        System.out.println(maxAndMin[0]);
        System.out.println(maxAndMin[1]);
    }
    public static int[] getMaxAndMin(int[] arr){
        int max =arr[0];
        int min = arr[0];
        for (int j : arr) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
//        int [] result ={max,min};
//        return result;
        return new int[]{max,min};

    }
}
