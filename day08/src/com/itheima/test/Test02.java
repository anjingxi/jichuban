package com.itheima.test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println("请在输入一个字符串:");
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();

        for (char aChar : chars) {
            System.out.println(aChar);
        }

    }
}
