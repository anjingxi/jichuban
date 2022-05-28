package com.itheima.test;

import java.util.Scanner;

/**
 * 键盘录入一个数判断是奇数还是偶数
 */
public class Demo_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+"这个数是偶数");

        }else{
            System.out.println(num+"这个数是奇数");
        }
    }
}
