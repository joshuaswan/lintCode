package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/31.
 */
public class HappyNumber {
    /**
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // write your code here

        while (n>10){
            n = happyNum(n);
        }
        if (n == 1 || n == 7){
            return true;
        }else {
            return false;
        }
    }

    public int happyNum(int num) {
        int result = 0;
        while (num / 10 > 0) {
            result += (num % 10) * (num % 10);
            num = num / 10;
        }
        return result + num * num;
    }
}
