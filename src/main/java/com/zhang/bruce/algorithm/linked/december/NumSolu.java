package com.zhang.bruce.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/21 19:42
 * 123  反转 321
 */
public class NumSolu {
    public int reverse(int x){
        int rev  = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev ;
    }
}
