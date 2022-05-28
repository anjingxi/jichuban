package com.itheima.test;

import java.util.Random;

/**
 * - 使用Random生成一个1到5之间的随机数
 * - 使用switch语句对该数字进行判断是几
 * - 1 控制台打印：奖品为洗衣粉一袋
 * - 2 控制台打印：奖品为洗衣粉二袋
 * - 3 控制台打印：很遗憾、您未中奖
 * - 4 控制台打印：奖品为兰博尼基500元代金券一张
 * - 5 控制台打印：奖品为iPhone手机一部
 */
public class Test11 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(5) + 1;
        switch (i) {
            case 1:
                System.out.println("奖品为洗衣粉一袋");
                break;
            case 2:
                System.out.println("奖品为洗衣粉二袋");
                break;
            case 3:
                System.out.println("很遗憾、您未中奖");
                break;
            case 4:
                System.out.println("奖品为兰博尼基500元代金券一张");
                break;
            case 5:
                System.out.println("奖品为iPhone手机一部");
                break;
            default:
        }

    }
}
