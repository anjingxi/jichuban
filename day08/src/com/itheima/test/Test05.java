package com.itheima.test;

import java.util.Scanner;

/**
 * 需求：键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
 *
 * 思路：
 *
 * 1. 键盘录入一个字符串，用 Scanner 实现
 * 2. 替换敏感词  replace:替换
 *    String replace(CharSequence target, CharSequence replacement)
 *    将当前字符串中的target (被替换的旧值 )内容，使用replacement (替换的新值) 进行替换返回新的字符串
 * 3. 输出结果
 *
 * 方法:String  replace(String target,String replacement):  target:需要被替换的字符串
 *
 * replacement   :替换成为新的字符串
 *
 * 返回值:替换完成后的结果
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        String replace = s.replace("NTMD", "****").replace("QNMD", "****").replace("TMD", "****");
        System.out.println(replace);
    }
}
