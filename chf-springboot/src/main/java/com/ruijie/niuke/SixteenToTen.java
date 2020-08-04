package com.ruijie.niuke;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 */
public class SixteenToTen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next().substring(2);
            System.out.println("str===" + str);
            System.out.println(Integer.parseInt(str, 16));
        }
    }
}
