package com.itheima.test;

/**
 * - 定义一个无参无返回值的方法：isEvenNum()
 *   - 方法里定义一个变量，赋值为10
 *   - 对该数字判断是奇偶数
 * - 在main方法中调用isEvenNum()方法
 */
public class Test06 {
    public static void main(String[] args) {
        isEvenNum();
    }
    public static void isEvenNum(){
        int n=10;
        if(n%2==0){
            System.out.println(n+"是一个偶数");
        }else{
            System.out.println(n+"是一个奇数");
        }
    }
}
