package com.willlee.leetcode.problems501_600;

//leetcode565
public class Leetcode565 {
    public int arrayNesting1(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = i; nums[j] != -1;) {
                cnt++;
                int t = nums[j];
                nums[j] = -1;// 访问过的数标记为-1
                j = t;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}