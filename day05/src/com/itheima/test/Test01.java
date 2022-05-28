package com.itheima.test;

public class Test01 {
    public static void main(String[] args) {
    print(10,100);
    }
    public static void print(int n,int b){
        for (int i = n; i <= b; i++) {
            if(i%2!=0){
                System.out.println(i);
            }

        }
    }
}
