package com.itheima.test;

/**
 * - 定义一个有参有返回值的方法：int sum(int a,int b)
 *   - 方法里对参数接收到的两个数字进行相加运算
 *   - 并将求和结果返回
 * - 在main方法中调用sum()方法，并传入两个个整数，接收结果
 * - 将接收到的结果在mian方法中打印
 */
public class Test09 {
    public static void main(String[] args) {
        int sum = sum(12, 15);
        System.out.println(sum);
    }
    public static int sum(int a,int b){
        return a+b;
    }
}