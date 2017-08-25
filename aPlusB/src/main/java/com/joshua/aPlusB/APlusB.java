package com.joshua.aPlusB;

/**
 * Created by joshua on 2017/8/25.
 */
public class APlusB {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        int jw = a & b;
        int jg = a ^ b;
        while (jw != 0) {
            int temp1 = jg;
            int temp2 = jw << 1;
            jw = temp1 & temp2;
            jg = temp1 ^ temp2;
        }
        return jg;
    }
}
