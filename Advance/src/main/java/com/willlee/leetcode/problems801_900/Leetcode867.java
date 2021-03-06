package com.willlee.leetcode.problems801_900;

public class Leetcode867 {
    // 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
    public int[][] transpose(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                ans[c][r] = A[r][c];
            }
        return ans;
    }

}
