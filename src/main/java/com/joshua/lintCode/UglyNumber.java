package com.joshua.lintCode;

/**
 * Created by joshua on 2017/9/13.
 */
public class UglyNumber {

    /**
     * @param num: An integer
     * @return: true if num is an ugly number or false
     */
    public boolean isUgly(int num) {
        // write your code here
        int flag = 1;
        if (num == 0)
            return false;
        while (flag != 0) {
            flag = 0;
            if (num % 2 == 0) {
                num = num / 2;
                flag++;
            }
            if (num % 3 == 0) {
                num = num / 3;
                flag++;
            }
            if (num % 5 == 0) {
                num = num / 5;
                flag++;
            }
        }
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
