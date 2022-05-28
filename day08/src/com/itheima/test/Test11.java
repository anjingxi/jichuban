package com.itheima.test;



/**
 * "javase javaee hellojava javanihao javawohao javadajiahao haomajava"
 * 将所有以java开始的单词替换成itheima
 * "itheimase  itheimaee hellojava itheimanihao  itheimawohao  itheimadajiahao haomajava"
 */
public class Test11 {
    public static void main(String[] args) {
        String s = "javase javaee hellojava javanihao javawohao javadajiahao haomajava";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            if(s1[i].startsWith("java")){
                 s1[i] = s1[i].replaceFirst("java", "itheima");

            }
        }StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            sb.append(s1[i]).append(" ");
        }
        String s3 = sb.toString();

        System.out.println(s3);

    }
}
