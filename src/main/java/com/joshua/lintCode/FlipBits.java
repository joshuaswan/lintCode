package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/30.
 */
public class FlipBits {
    /**
     * @param a, b: Two integer
     *           return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int count = 0;
        long tempA = a;
        long tempB = b;
        if (a == b) {
            return 0;
        }
        if (a < 0) {
            tempA = 2147483647 + a + 1;
            count++;
        }
        if (b < 0) {
            tempB = 2147483647 + b + 1;
            count++;
        }
        if (a < 0 && b < 0) {
            count--;
        }

        if (tempA == 0 || tempB == 0) {
            count++;
        } else if (tempA > tempB && tempA / tempB >= 2) {
            count++;
        } else if (tempA < tempB && tempB / tempA >= 2) {
            count++;
        }
        while (tempA / 2 > 0 || tempB / 2 > 0) {
            if (tempA % 2 != tempB % 2) {
                count++;
            }
            tempB = tempB / 2;
            tempA = tempA / 2;
        }
        return count;
    }
}
