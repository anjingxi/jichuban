package com.itheima.test;

/**
 * - main方法中定义2个数组，一个int类型，一个double类型，分别保存一些元素即可
 * - 定义2个方法sum()，分别对int类型数组和double类型数组进行求和
 * - 在main方法中调用sum方法，传递对应数组，接收求和结果并打印
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 55, 66, 99, 45, 14, 66, 78, 13, 54};
        double[] brr = {11, 55, 88, 99, 77, 33, 66, 44, 77, 88, 15};
        int sum1 = sum(arr);
        double sum = sum(brr);
        System.out.println(sum1);
        System.out.println(sum);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double sum(double[] brr) {
        double sum = 0;
        for (double v : brr) {
            sum +=v;
        }
        return sum;
    }
}
