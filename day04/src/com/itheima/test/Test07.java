package com.itheima.test;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入第"+(i+1)+"个分数");
            int score= sc.nextInt();
            if(score>=0&&score<=100){
                arr[i]=score;
                i++;
            }else {
                System.out.println("输入错误请重新输入:");
            }
        }

        int sum =0;
        int max =arr[0];
        int min= arr[0];

        for (int j : arr) {
            sum += j;
           max= Math.max(max, j);
           min= Math.min(min, j);
        }

        int avg = (sum-max-min)/(arr.length-2);
        System.out.println("分数和为:"+sum);
        System.out.println("去掉一个最高分,去掉一个最低分\n" +
                "平均分为:"+avg);


    }
}
