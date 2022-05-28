package com.itheima.test;


import java.util.Scanner;

/**
 * @author ly
 *
 */
public class Demo {
    public static void main(String[] args) {
        //键盘录入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int i = sc.nextInt();
        int n = 2;
        //判断这个数是奇数还是偶数
        if (i%n==0){
            System.out.println("这个数是一个偶数");

        }else{
            System.out.println("这个数是一个奇数");
        }


    }
}
