package com.itheima.test;

import java.util.Scanner;

/**
 * - 键盘录入 两个数
 * - 计算他们的和
 * - 计算他们的差
 * - 计算他们的积
 * - 计算他们的商
 * @author ly
 *
 */
public class Demo06 {
    public static void main(String[] args) {
        //键盘录入两个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int i = sc.nextInt();
        System.out.println("请再输入一个整数:");
        int i1 = sc.nextInt();
        System.out.println("他们的和是:"+(i+i1));
        System.out.println("他们的差是:"+(i-i1));
        System.out.println("他们的积是:"+(i*i1));
        System.out.println("他们的商是:"+(i/i1));

    }
}
