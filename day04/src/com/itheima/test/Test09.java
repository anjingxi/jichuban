package com.itheima.test;

import java.util.Random;

/**
 *

 */
public class Test09 {
    public static void main(String[] args) {
        //- 创建一个String字符串类型数组，保存如下3个数据(代表商品名)
        //  - 小米手机       华为手机     苹果手机
        //- 创建一个double类型数组，保存如下3个数据(代表商品价格)
        //  - 1999              2999            3999
        //- 创建一个int类型数组，保存如下3个数据(代表商品库存)
        //  - 25                 40                  30
        String[] name = {"小米手机","华为手机","苹果手机"};
        double[] price ={1999,2999,3999};
        int[] stock ={25,40,30};
        //- 使用Random生成一个正确数组索引范围的随机数
        Random r = new Random();
        int index = r.nextInt(3);
        System.out.println(name[index]+" "+price[index]+" "+stock[index]);
        //- 将这个随机数作为数组的索引，将对应商品信息打印出来
        //  - 例如：随机数为2，则打印：苹果手机 3999 30
    }
}
