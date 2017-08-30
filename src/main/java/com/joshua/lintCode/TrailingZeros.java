package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/25.
 */
public class TrailingZeros {

    /**
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long result = 0;
        while (n/5 != 0){
            result += n/5;
            n = n/5;
        }
        return result;

    }
}
