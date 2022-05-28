package com.itheima.test;

public class Array {
    public static void main(String[] args) {
        int [][] arr = {{11,22,33},{44,55,66},{77,88,99}};
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }

        }
    }
}
