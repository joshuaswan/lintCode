package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/30.
 */
public class FlipBits {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int diff = 0;
        if (a>b){
            diff = a-b;
        }else {
            diff = a-b;
        }
        return countOnes(diff);
    }
    public static int countOnes(int num) {
        // write your code here
        int count = 0;
        if (num < 0){
            num = 2147483647 + num + 1;
            count++;
        }
        if (num == 1) {
            return 1;
        }
        while (num / 2 > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }
        if (num == 1) {
            count++;
        }
        return count;
    }
}
