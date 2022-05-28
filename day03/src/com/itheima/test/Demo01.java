package com.itheima.test;

import java.util.Scanner;

/**
 * @author ly
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        //键盘录入一个分数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的分数:");
        int i = sc.nextInt();
        //判断输入的数据是否合理
        if(i>=0&&i<=100){
            if(i>=95){
                System.out.println("奖励一个奥特曼");
            }else if(i>=85){
                System.out.println("奖励一个大嘴巴子");
            }else if (i>=75){
                System.out.println("奖励一个空气");
            }else if(i>60){
                System.out.println("奖励揍一顿");
            }else if(i==60){
                System.out.println("完美");
            }else {
                System.out.println("废物");
            }
        }else {
            System.out.println("输入错误!");
        }
    }
}
