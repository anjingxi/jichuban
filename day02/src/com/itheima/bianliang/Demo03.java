package com.itheima.bianliang;

/**
 * @author ly
 */
public class Demo03 {
    public static void main(String[] args) {
        //变量不允许重复定义
        int i =10;
        //int i =20;
        //变量在使用之前一定要先赋值
        int q;
        q = 100;
        // 一条语句可以定义多个变量  中间用逗号来分割,数据类型只能出现一次  ;
        int w=10,e=20,r=30;
        // 定义float和long变量的注意事项 (需要使用f或F, l或者L 来标识常量的类型)

        float t = 10.3F;
        long  y = 100000L;

        //变量的作用域范围(作用域:{}包裹的范围就叫作用域, java中变量只在自己的作用域中生效)
        {
            int u = 100;
            System.out.println(u);
        }
            // u = 10000;

        int b = 10000;
        long a = b;
        System.out.println(a);
    }
}
