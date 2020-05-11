package com.willlee.leetcode.problems1_100;

public class Leetcode79 {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (helper(board, chars, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] nums, char[] chars, int start, int row, int col) {
        // 最后一个元素，不需要继续搜索
        if (start >= chars.length)
            return true;
        if (row < 0 || row >= nums.length || col < 0 || col >= nums[0].length || chars[start] != nums[row][col]) {
            return false;
        }
        // 查找相邻元素
        // 遍历过的数组标记
        nums[row][col] += 100;
        // 求相邻元素是否为下一个元素：上下左右
        boolean res = helper(nums, chars, start + 1, row - 1, col) || helper(nums, chars, start + 1, row + 1, col)
                || helper(nums, chars, start + 1, row, col - 1) || helper(nums, chars, start + 1, row, col + 1);
        // 当前元素还原
        nums[row][col] -= 100;
        return res;
    }
}
