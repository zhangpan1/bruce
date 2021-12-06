package com.zhang.bruce.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/11/26 16:18
 * 给一个整数数组nums,和一个整数目标值target，找出和为目标值target的两个整数，返回他们的数组下标
 */
public class SumSolution {
    public int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for (int i = 0; i < n; ++ i) {
            for (int j = i + 1; j < n ; ++ j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
