package com.itheima.luru;
/*
 * 导包
 * */

import java.util.Scanner;

/**
 * @author ly
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //调用方法
        int i = sc.nextInt();

        System.out.println(i);
        System.out.println("------------------------");
        if (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        } else {
            System.out.println("错误");
        }
        System.out.println("-------------");
        String next = sc.next();
        System.out.println(next);
        System.out.println("---------------------------");
        String c = sc.nextLine();
        System.out.println(c);



    }
}
