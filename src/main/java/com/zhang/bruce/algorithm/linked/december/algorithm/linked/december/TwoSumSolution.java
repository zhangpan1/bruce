package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/6 10:29
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 */
public class TwoSumSolution {
    public int[] twoSum(int[] sums,int target){
        int n = sums.length;
        for (int i = 0; i < n; i ++ ) {
            for (int j = i + 1; j < n ; j ++) {
                if ((i + j) == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    public int[] twoSumMap(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]) , i};
            }
        }
        return new int[0];
    }
}
