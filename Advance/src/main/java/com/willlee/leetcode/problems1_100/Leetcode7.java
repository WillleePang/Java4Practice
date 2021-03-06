package com.willlee.leetcode.problems1_100;

//leetcode7
public class Leetcode7 {
    public static int reverse(int x) {
        int result = 0;
        do {
            if (214748364 < Math.abs(result)) {
                return 0;
            }
            if (214748364 == Math.abs(result) && (x > 7 || x < -8)) {
                return 0;
            }
            result = result * 10 + (x % 10);
        } while ((x = x / 10) != 0);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(10000000));
    }
}
