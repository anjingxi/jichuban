package com.itheima.test;

import com.itheima.domain.Student01;

import java.util.Arrays;

/**
 * 1."鹿晗,28,淖马村;关晓彤,24,大马村;吴亦凡,30,小马村;蔡徐坤,23,上兰村"
 * 将字符串中的信息封装的学生对象中
 * 并将学生对象数据存储到数组中
 */
public class Test10 {
    public static void main(String[] args) {
        String s = "鹿晗,28,淖马村;关晓彤,24,大马村;吴亦凡,30,小马村;蔡徐坤,23,上兰村;";
        String[][] arr = new String[3][3];
        String[] split = s.split(";");
//        System.out.println(split[0]);
//        System.out.println(split[1]);
//        System.out.println(split[2]);
       // System.out.println(Arrays.toString(split));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String[] q = split[i].split(",");
                arr[i][j]=q[j];
            }
       }
        Student01[] stu = new Student01[3];
        //System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
             stu[i] = new Student01();
           stu[i].setName(arr[i][0]);
           stu[i].setAge(arr[i][1]);
           stu[i].setAddress(arr[i][2]);
        }

        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);

        }

    }
}
