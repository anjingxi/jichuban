package com.itheima.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String username = "dijia";
        String password = "zhangsan";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pass = sc.nextLine();
            if(username.equals(name)&&password.equals(pass)){
                System.out.println("登录成功");
                break;
            } else if (i==2) {
                System.out.println("登录失败没有机会了");
                  break;
            } else {
                System.out.println("登录失败,你还有"+(2-i)+"次机会");
            }

        }
    }

}
