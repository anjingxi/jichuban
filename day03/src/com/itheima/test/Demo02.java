package com.itheima.test;


import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数:");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("海底捞");
                break;
            case 2:
                System.out.println("吃龙虾");
                break;
            case 3:
                System.out.println("吃火锅");
                break;
            case 4:
                System.out.println("吃西餐");
                break;
            case 5:
                System.out.println("老八食堂");
                break;
            case 6:
                System.out.println("睡一天");
                break;
            case 7:
                System.out.println("再睡一天");
                break;
            default:
                System.out.println("输入有误");


        }
    }
}
