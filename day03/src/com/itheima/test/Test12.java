package com.itheima.test;

import java.util.Scanner;

/**
 * - 定义一个商品库存的变量，赋值为20
 * - 定义一个商品价格的变量，赋值为2000
 * - 键盘录入一个购买数量
 * - 使用if语句判断购买数量是否超出了商品库存
 *   - 是：提示购买数量不在库存范围内
 *   - 否：根据购买数量和商品价格计算总金额
 * - 使用if语句判断总金额满足哪个打折条件
 *   - 小于等于2000元，不打折
 *   - 2000到10000元，打9折
 *   - 超过10000元以上的，打8折
 * - 将最终的总金额打印到控制台
 */
public class Test12 {
    public static void main(String[] args) {
        int stock = 20;
        int price = 2000;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购买数量:");
        int num = sc.nextInt();
        if(num>stock){
            System.out.println("购买数量不在库存范围内");
        }else {
           sum = num * price;
           if(sum<=2000){
               System.out.println("不打折");
               System.out.println(sum);
           }else if(sum>2000&&sum<=10000){
               System.out.println("打9折");

               double sum1 = 0.9*sum;
               System.out.println(sum1);

           }else if(sum>10000){
               System.out.println("打8折");
               double v = 0.8 * sum;
               System.out.println(v);
           }
        }


    }
}
