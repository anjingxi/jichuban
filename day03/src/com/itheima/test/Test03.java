package com.itheima.test;

/**
 * @author ly
 *
 */
public class Test03 {
    public static void main(String[] args) {
        //定义一个sum变量
        int sum = 0;
        //
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 0; i <= 5; i++) {
            sum1+=i;

        }
        System.out.println(sum1);
    }
}
