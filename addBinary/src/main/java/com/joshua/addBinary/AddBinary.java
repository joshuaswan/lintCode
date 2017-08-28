package com.joshua.addBinary;

/**
 * Created by joshua on 2017/8/28.
 */
public class AddBinary {
    /**
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        // write your code here
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        int lengthA = charA.length;
        int lengthB = charB.length;
        int resultLength = 0;
        if (lengthA >= lengthB) {
            resultLength = lengthA + 1;
        } else {
            resultLength = lengthB + 1;
        }
        char[] allA = full(charA, resultLength);
        char[] allB = full(charB, resultLength);
        char[] resultS = new char[resultLength];
        boolean flag = false;
        for (int i = resultLength - 1; i >= 0; i--) {
            if (allA[i] == '1' && allB[i] == '1') {
                if (flag) {
                    resultS[i] = '1';
                } else {
                    resultS[i] = '0';
                }
                flag = true;
            } else if (allA[i] > allB[i]) {
                if (flag) {
                    resultS[i] = '0';
                    flag = true;
                } else {
                    resultS[i] = allA[i];
                    flag = false;
                }
            } else if (allA[i] < allB[i]) {
                if (flag) {
                    resultS[i] = '0';
                    flag = true;
                } else {
                    resultS[i] = allB[i];
                    flag = false;
                }
            } else {
                if (flag) {
                    resultS[i] = '1';
                    flag = false;
                } else {
                    resultS[i] = '0';
                    flag = false;
                }
            }
        }
        if (resultS[0] == '0') {
            resultS[0] = 0;
        }
        return String.valueOf(resultS);
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
