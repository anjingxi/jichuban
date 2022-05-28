package com.itheima.test;

import java.util.Scanner;

/**
 * @author ly
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){

            System.out.println("请输入一个数字:");
            System.out.println("退出请按q");
            String s;
            s = sc.nextLine();
            char c = s.charAt(0);
            if(c>='1'&&c<='7'){
                switch (c) {
                    case '1':
                        System.out.println("海底捞");
                        break;
                    case '2':
                        System.out.println("吃龙虾");
                        break;
                    case '3':
                        System.out.println("吃火锅");
                        break;
                    case '4':
                        System.out.println("吃西餐");
                        break;
                    case '5':
                        System.out.println("老八食堂");
                        break;
                    case '6':
                        System.out.println("睡一天");
                        break;
                    case '7':
                        System.out.println("再睡一天");
                        break;
                    default:
                }
            }else if(c=='q'){
                break;
            }else {
                System.out.println("输入错误请重新输入!");

            }
        }
    }
}
