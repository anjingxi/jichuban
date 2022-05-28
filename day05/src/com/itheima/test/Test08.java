package com.itheima.test;

/**
 - 定义一个有参无返回值的方法：isEvenNum(int num)
 - 方法里对参数接收到的数字判断是奇偶数
 - 在main方法中调用isEvenNum()方法，并传入一个整数
 */
public class Test08 {
    public static void main(String[] args) {
        isEvenNum(12);
    }
    public static void isEvenNum(int num){
        if(num%2==0){
            System.out.println(num+"这个数是一个偶数");
        }else{
            System.out.println(num+"这个数是一个奇数");
        }
    }
}
