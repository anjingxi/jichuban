package com.itheima.test;

/**
 * - 创建一个String字符串类型数组，保存如下3个数据(代表商品名)
 *   - 小米手机       华为手机     苹果手机
 * - 创建一个double类型数组，保存如下3个数据(代表商品价格)
 *   - 1999              2999            3999
 * - 创建一个int类型数组，保存如下3个数据(代表商品库存)
 *   - 25                 40                  30
 * - 使用一个for循环遍历其中某一个数组，将所有数据按照关系打印
 */
public class Test08 {
    public static void main(String[] args) {
        String[] name = {"小米手机","华为手机","苹果手机"};
        double[] price ={1999,2999,3999};
        int[] stock ={25,40,30};
        for (int i = 0; i < 3; i++) {
            System.out.print(name[i]+" ");
            System.out.print(price[i]+" ");
            System.out.println(stock[i]+" ");
        }

    }
}
