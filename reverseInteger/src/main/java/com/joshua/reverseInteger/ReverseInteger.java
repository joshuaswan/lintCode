package com.joshua.reverseInteger;

/**
 * Created by joshua on 2017/8/24.
 */
public class ReverseInteger {

    /**
     * @param n: the integer to be reversed
     * @return: the reversed integer
     */

    public int reverseInteger(int n) {
        // write your code here
        boolean flag = true;
        Long result = 0L;
        if (n<0){
            n=-n;
            flag = false;
        }

        int transForm = n;
        int length = 1;
        while (transForm / 10 != 0){
            transForm = transForm/10;
            length++;
        }
        int single = 0;
        transForm = n;
        for (int i=1;i<=length;i++){
            single = transForm %10;
            transForm = transForm /10;
            Long temp = 1L;
            for (int j=i;j<length;j++){
                temp *= 10;
            }
            result += temp * single;
        }

        if (result>2147483647){
            return 0;
        }
        if (!flag){
            return (int) -result;
        }
        return result.intValue();
    }
}
