package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 * 随机生成一个1-100之间的随机数
 *
 * @author ly
 *

 */
public class Test01 {
    public static void main(String[] args) {

        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入你需要猜的数字:");
            int cai = sc.nextInt();
            if(cai>number){
                System.out.println("猜大了");
            }else if(cai<number){
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜你,猜中了!!");
                break;
            }
        }
    }
}
