package com.itheima.test;

import com.itheima.domain.Student02;

import java.util.Arrays;

public class Test12 {
    /**
     * "迪迦,18,中国;泰罗,20,日本;赛文,21,美国"
     */

        public static void main(String[] args) {
            String s = "迪迦,18,中国;泰罗,20,日本;赛文,21,美国";
            String[] split = s.split(";");

            String[][] ser = new String[split.length][];

            //得到一个二维数组
            for (int i = 0; i < ser.length; i++) {
                ser[i] = split[i].split(",");
            }
            System.out.println(Arrays.deepToString(ser));
            //创建一个student类型的数组,
            Student02[] stu = new Student02[split.length];
            for (int i = 0; i < stu.length; i++) {
                stu[i]= new Student02();
                for (int j = 0; j < ser[i].length;) {
                    stu[i].setName(ser[i][j]);
                    j++;
                    stu[i].setAge(ser[i][j]);
                    j++;
                    stu[i].setAddress(ser[i][j]);
                    j++;
                }

            }
            System.out.println(stu[0]);
            System.out.println(stu[1]);
            System.out.println(stu[2]);

        }
    }

