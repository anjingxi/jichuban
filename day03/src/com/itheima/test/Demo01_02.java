package com.itheima.test;

import java.util.Scanner;

/**
 * 键盘录入小明的成绩
 * ifelse语句判断
 *
 */
public class Demo01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩:");
        int score = sc.nextInt();
        if(score>=0&&score<=100){
            if (score>=90) {
                System.out.println("奖励迪迦");
            }else if(score>=80){
                System.out.println("奖励泰罗");
            }else if(score>=70){
                System.out.println("奖励赛文");
            }else if(score>=60){
                System.out.println("奖励艾斯");
            }else{
                System.out.println("奖励打一顿");
            }

        }else {
            System.out.println("输入错误");
        }
    }
}
