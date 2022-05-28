package com.itheima.test;

import com.itheima.domain.Student;

import java.util.Scanner;

/**
 * 需求：以字符串的形式从键盘录入学生信息，例如：“张三 , 23”从该字符串中切割出有效数据封装为Student学生对象
 *
 * 思路：
 *
 * 1. 编写Student类，用于封装数据
 * 2. 键盘录入一个字符串，用 Scanner 实现
 * 3. 根据逗号切割字符串，得到（张三）（23）
 *    String[] split(String regex) ：根据传入的字符串作为规则进行切割，将切割后的内容存入字符串数组中，并将字符串数组返回
 * 4. 从得到的字符串数组中取出元素内容，通过Student类的有参构造方法封装为对象
 * 5. 调用对象getXxx方法，取出数据并打印。
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请以'姓名,年龄'的格式输入字符串");
        String s = sc.nextLine();
        String[] arr = s.split(",");
        Student stu = new Student(arr[0], arr[1]);
        String name = stu.getName();
        String age = stu.getAge();
        System.out.println("姓名:"+name+"年龄:"+age);

    }
}
