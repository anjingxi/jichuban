package com.itheima.test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数");
            arr[i]=sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int i : arr) {
            sum1+=i;
        }
        System.out.println(sum1);
    }
}
