package com.itheima.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

    int[] arr = {11, 22, 33, 44, 55};
//        int  o = Array.getInt(arr, 0);
//        System.out.println(o);
//        Array.setInt(arr,0,3);
//        System.out.println(arr[0]);
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int temp = Array.getInt(arr, start);
            Array.setInt(arr,start,arr[end]);
            Array.setInt(arr,end,temp);
            end--;
            start++;
        }
        System.out.println(Arrays.toString(arr));

    }
}


