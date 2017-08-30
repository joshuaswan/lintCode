package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/22.
 */
public class Palindrome {
    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     **/
    public boolean isPalindrome(int num) {
        // write your code here
        if (num >= 0 && num < 10) {
            return true;
        }
        int transForm = num;
        int length = 1;
        while (transForm / 10 != 0){
            transForm = transForm/10;
            length++;
        }
        int single = 0;
        transForm = num;
        int result = 0;
        for (int i=1;i<=length;i++){
            single = transForm %10;
            transForm = transForm /10;
            int temp = 1;
            for (int j=i;j<length;j++){
                temp *= 10;
            }
            result += temp * single;
        }
        if (result == num)
            return true;
        else
            return false;
    }
}
