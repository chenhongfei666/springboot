package com.ruijie.niuke;

import java.util.Scanner;

/**
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。
 * 小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
 * 答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，
 * 喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，
 * 喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，
 * 最多可以换多少瓶汽水喝？
 * <p>
 * // f(n)=n/3 + f(n%3+n/3)，貌似递归次数更少。
 * // n/3是能直接换到的汽水数，n%3+n/3是新换到的汽水瓶子+上次换剩下的
 */
public class EmptyBottle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(5 % 3);
        System.out.println(5 / 3);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num != 0) {
                System.out.println(f(num));
            }
        }
        sc.close();

    }

    private static int f(int num) {
        if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return num / 3 + f(num % 3 + num / 3);
        }
    }


}
