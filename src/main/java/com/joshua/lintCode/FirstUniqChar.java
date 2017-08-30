package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/30.
 */
public class FirstUniqChar {
    /**
     * @param s a string
     * @return it's index
     */
    public int firstUniqChar(String s) {
        // Write your code here
        char[] stringS = s.toCharArray();
        if (stringS.length == 0) {
            return -1;
        }
        int i = 0;
        for (; i < stringS.length; i++) {
            boolean flag = true;
            if (stringS[i] == 0) {
                continue;
            }
            int j = i + 1;
            for (; j < stringS.length; j++) {
                if (stringS[i] == stringS[j]) {
                    stringS[j] = 0;
                    flag = false;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
