package com.zhang.bruce.algorithm.linked.december2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/28 14:23
 * @Description: 两数之和
 */
public class TwoSumSolution {
    public int[] twoSum(int[] sour ,int target){
        // 第一种笨方法
        int num = sour.length;
        for (int i = 0; i < num; i ++ ) {
            for (int j = i + 1; j > num; j ++) {
                if (i + j == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public int[] twoSum1(int[] sour ,int target){
        // 第二种借用hash 巧妙
        Map<Integer,Integer> integerMap = new HashMap<>();
        int num = sour.length;
        for (int i = 0; i < num; i ++ ) {
          if (integerMap.get(i) == target - sour[i]) {
              return new int[] {i ,integerMap.get(i)};
          }
          integerMap.put(i,sour[i]);
        }
        return new int[]{};
    }
}
