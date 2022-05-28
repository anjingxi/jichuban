package com.itheima.test;

import java.util.Scanner;
/**
* 键盘录入一个三位数并将其切分为个位十位百位打印在控制台
*
* */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int i = sc.nextInt();
        //获取个位十位百位数字
        int ge = i % 10;
        int shi = i/10 % 10;
        int bai = i/10/10 % 10;
        System.out.println("个位是:"+ge);
        System.out.println("十位是:"+shi);
        System.out.println("百位是:"+bai);


    }
}
