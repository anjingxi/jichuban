package com.itheima.test;

import java.util.Scanner;

/**
 * 键盘录入一个字符串
 * while死循环
 * 通过charat(0)获取录入键盘的第一个字符
 * switch
 */
public class Test01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数字");
            System.out.println("退出请按q");
            String s = sc.nextLine();
            char num = s.charAt(0);
            if (num >= '1' && num <= '7') {
                switch (num) {
                    case '1':
                        System.out.println("吃西瓜");
                        break;
                    case '2':
                        System.out.println("吃芒果");
                        break;
                    case '3':
                        System.out.println("吃草莓");
                        break;
                    case '4':
                        System.out.println("吃苹果");
                        break;
                    case '5':
                        System.out.println("吃榴莲");
                        break;
                    case '6':
                        System.out.println("吃冬瓜");
                        break;
                    case '7':
                        System.out.println("吃南瓜");
                        break;
                    default:
                }

            } else if (num == 'q') {
                break;
            } else {
                System.out.println("输入错误请重新输入:");
            }
        }
    }
}
