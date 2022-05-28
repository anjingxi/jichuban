package com.itheima.test;

import java.util.Scanner;

/**
 * - 使用适合的数据类型定义一些变量，保存如下商品信息
 *   - 商品名称：华为手机
 *   - 商品价格：2999.88
 *   - 商品库存：50
 *   - 是否禁售：否
 * - 并将这些变量打印到控制台上显示
 * - 通过键盘录入一个购买数量，保存到一个单独的变量中
 * - 计算购买商品的总价格并输出到控制台上显示
 * @author ly
 */
public class HuaWeiDemo {
    public static void main(String[] args) {
        String name = "华为手机";
        double price = 2999.88;
        int save = 50;
        boolean sell = false;
        System.out.println("商品名称："+name);
        System.out.println("商品价格："+price);
        System.out.println("商品库存："+save);
        System.out.println("是否禁售: "+sell);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要购买的数量:");
        double num = sc.nextDouble();
        System.out.println(num);
        double v = num * price;
        System.out.print("商品总价为:");
        System.out.println(v);



    }
}
