package com.willlee.leetcode.problems1_100;

public class Leetcode58 {
    public int lengthOfLastWord(String s) {
        int a = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                a++;
            }
        }
        return a;
    }
}
