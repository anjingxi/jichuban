package com.itheima.test;

public class Test01 {
    public static void main(String[] args) {
        int[] arr ={11,22,33,44,55};
        change(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    public static void change(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
}
