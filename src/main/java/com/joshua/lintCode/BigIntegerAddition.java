package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/31.
 */
public class BigIntegerAddition {
    /**
     * @param num1 a non-negative integers
     * @param num2 a non-negative integers
     * @return return sum of num1 and num2
     */
    public String addStrings(String num1, String num2) {
        // Write your code here
        char[] char1 = num1.toCharArray();
        char[] char2 = num2.toCharArray();
        int length1 = char1.length;
        int length2 = char2.length;
        int resultLength = 0;
        if (length1 >= length2) {
            resultLength = length1 + 1;
        } else {
            resultLength = length2 + 1;
        }
        char[] allA = full(char1, resultLength);
        char[] allB = full(char2, resultLength);
        char[] resultS = new char[resultLength];
        boolean flag = false;
        int temp = 0;
        for (int i = resultLength - 1; i >= 0; i--) {
            if (flag) {
                temp = allA[i] - 48 + allB[i] - 48 + 1;
            } else {
                temp = allA[i] - 48 + allB[i] - 48;
            }
            if (temp >= 10) {
                flag = true;
                if (flag) {
                    resultS[i] = (char) (temp - 10 + 48);
                }
            } else {
                flag = false;
                resultS[i] = (char) (temp + 48);
            }
        }
        int i = 0;
        for (; i < resultS.length; i++) {
            if (resultS[i] == '0') {
                resultS[i] = 0;
            } else if (resultS[i] > '0') {
                break;
            }
        }
        if (i == resultS.length) {
            resultS[i - 1] = '0';
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int j = 0; j < resultS.length; j++) {
            if (resultS[j] != 0) {
                stringBuffer.append(resultS[j]);
            }
        }
        return stringBuffer.toString();
    }

    public char[] full(char[] source, int resultLength) {
        int sourceLength = source.length - 1;
        char[] result = new char[resultLength];
        for (int i = resultLength - 1; i >= 0; i--) {
            if (sourceLength < 0) {
                result[i] = '0';
            } else {
                result[i] = source[sourceLength];
                sourceLength--;
            }
        }
        return result;
    }
}
