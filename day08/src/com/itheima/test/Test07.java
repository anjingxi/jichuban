package com.itheima.test;

import java.util.Scanner;

/**
 * 需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是对称字符串：123321、111
 * 非对称字符串：123123
 *
 * 思路：
 * ① 键盘录入一个字符串，用 Scanner 实现
 * ② 将键盘录入的字符串反转
 * ③ 使用反转后的字符串，和原字符串进行比对
 * ④ 如果相同，则输出是对称字符串，反之输出不是对称字符串
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        if(s.equals(s1)){
            System.out.println(s+"是对称字符串");
        }else {
            System.out.println(s+"不是对称字符串");
        }

    }
}
