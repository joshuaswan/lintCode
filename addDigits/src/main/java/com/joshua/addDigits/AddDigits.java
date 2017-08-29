package com.joshua.addDigits;

/**
 * Created by joshua on 2017/8/28.
 */
public class AddDigits {
    /**
     * @param num a non-negative integer
     * @return one digit
     */
    public int addDigits(int num) {
        // Write your code here
        int result = 0;
        if (num < 10){
            return num;
        }
        do {
            do {
                result += num % 10;
                num = num/10;
            }while (num / 10 != 0);
            result += num;
            num = result;
        } while (result >= 10);
        return result;
    }

}
