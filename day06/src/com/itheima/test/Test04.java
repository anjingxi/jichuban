package com.itheima.test;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int temp=0;
        int l = arr.length-1;
        for (int i = 0; i < l; i++,l--) {
            temp=arr[i];
            arr[i]=arr[l];
            arr[l]=temp;
        }
        System.out.println(Arrays.toString(arr));
        int temp1 = 0;
        for(int i =0;i<=arr.length/2;i++){
         temp1=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
