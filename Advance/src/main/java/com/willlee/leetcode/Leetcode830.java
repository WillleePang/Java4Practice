package com.willlee.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    我们可以从左到右对字符串进行扫描，并找到每个分组的左端点和右端点。如果某一个分组的长度大于等于 3，那么就将这个分组加入到答案中。
    算法
    我们维护两个指针 i, j，分别为分组的左端点和右端点，且 i <= j。我们不断增加 j 的值，直到 S[i] 和 S[j] 不在一个分组中，此时有 S[j] != S[j + 1] ，对应的分组为 [i, j]。
    在这之后，我们令 i = j + 1，并开始寻找下一个分组。
 */
public class Leetcode830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        List<List<Integer>> ans = new ArrayList();
        int i = 0, N = S.length();
        for (int j = 0; j < N; ++j) {
            if (j == N - 1 || S.charAt(j) != S.charAt(j + 1)) {
                if (j - i + 1 >= 3) {
                    ans.add(Arrays.asList(new Integer[] { i, j }));
                }
                i = j + 1;
            }
        }
        return ans;
    }
}
