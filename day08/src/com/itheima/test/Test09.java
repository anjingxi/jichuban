package com.itheima.test;

import java.util.Scanner;

/**
 * 键盘录入字符串 要求 将小写字母字符  大写字母字符   数字字符 一次排列
 * 先小写字母
 * "dfghhj"+"GGHKJJKP"+"135163584"
 * 先分 后和
 */
public class Test09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {


                sb.append(c);
            }else if(c>='A'&&c<='Z'){

                sb1.append(c);
            } else if (c>='0'&&c<='9') {

                sb2.append(c);

            }
        }
        String s1 = sb.append(sb1).append(sb2).toString();
        System.out.println(s1);



    }
}
