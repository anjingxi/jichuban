package com.itheima.test;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {


        int a = 10;
        int c = a++ + ++a;
        System.out.println(c);
        int i = 1;

        int i1 = (++i) + (++i);
        System.out.println(i1);
    }
}
