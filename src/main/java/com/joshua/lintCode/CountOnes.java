package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/28.
 */
public class CountOnes {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
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
