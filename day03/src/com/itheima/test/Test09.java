package com.itheima.test;

/**
 * - 聚会中玩一个小游戏，1到100之间的数字每个人按照顺序说一个，
 *   其中数字中包含7的或者7的倍数都要说过
 * - 通过for循环实现1到100之间所有的数字
 * - 循环中使用if语句判断是否满足说过的数字
 *   - 是：控制台打印 过
 *   - 否：控制台打印数字本身
 */
public class Test09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i%7==0||i %10 ==7||i/10%10==7){
                System.out.println("过");
            }else{
                System.out.println(i);
            }


        }
    }
}
