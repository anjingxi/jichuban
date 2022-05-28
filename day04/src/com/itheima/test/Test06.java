package com.itheima.test;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int[] arr = {18,88,55,14,16,24,33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的数据");
        int num = sc.nextInt();
        int index = -1;
        System.out.println(arr[10]);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                index = i;
                break;
            }
        }
            if(index<0){
                System.out.println("没找到");
            }else{
                System.out.println("找到了,在"+index+"上");
            }
    }
}
