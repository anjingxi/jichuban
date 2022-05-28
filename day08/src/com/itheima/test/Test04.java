package com.itheima.test;

import java.util.Scanner;

/**
 * 需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽最终效果为：156****1234
 *
 * 思路：
 *
 * 1. 键盘录入一个字符串，用 Scanner 实现
 * 2. 截取字符串前三位
 *    String substring(int beginIndex, int endIndex) ：从beginIndex索引位置开始截取，截取到endIndex索引位置， 得到新字符串并返回（包含头，不包含尾）
 *    String s1 = telString.substring(0,3);
 * 3. 截取字符串后四位
 *    String substring(int beginIndex) : 从传入的索引位置处，向后截取，一直截取到末尾，得到新的字符串并返回
 *    String s2 = telString.substring(7);
 * 4. 将截取后的两个字符串，中间加上****进行拼接，输出结果
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个电话:");
        String s = sc.nextLine();
        String s1 = s.substring(0, 3);
        String s2 = s.substring(7, 11);
        String s3 = s1+"****"+s2;
        System.out.println(s3);
    }
}
