package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/20 11:05
 * 两数之和
 */
public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for (int i = 0; i < n ; i ++) {
            for (int j = i + 1; j < n;j ++) {
                if ((nums[i] + nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    public int[] twoSum1(int[] nums,int target){
        Map<Integer,Integer> hashtable = new HashMap<Integer,Integer>();
        for (int i = 0 ; i < nums.length ; i ++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}
