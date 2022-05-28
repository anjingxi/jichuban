package com.itheima.test;

import java.util.Scanner;

/**
 * - 通过键盘录入一个1~100之间的数字
 * - 使用if语句判断这个数字是否满足以下条件之一：
 *   - 7的倍数
 *   - 数字中是否包含7(个位或十位)
 * - 如果满足任意一个条件，则控制台输出一个"过"字，否则输出该数字本身
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个两位数");
        int num = sc.nextInt();
        if(num%7==0||num %10 ==7||num/10%10==7){
            System.out.println("过");
        }else if(num>9&&num<100){
            System.out.println(num);
        }else {
            System.out.println("输入错误");
        }


    }
}
