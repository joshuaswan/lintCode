package com.joshua.lintCode;

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
        if (num < 0){
            return 1;
        }
        do {
            result = add(num);
            num = result;
        } while (result >= 10);
        return result;
    }

    public int add(int num){
        int result = 0;
        if (num < 10){
            return num;
        }
        else {
            do {
                result += num %10;
                num = num/10;
            }while (num/10!=0);
        }
        return result + num;
    }
}
