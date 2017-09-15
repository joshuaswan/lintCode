package com.joshua.lintCode;

/**
 * Created by joshua on 2017/9/15.
 */
public class UniqueCharacters {

    /**
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        if (str.length() <= 1) {
            return true;
        }
        char[] resource = str.toCharArray();
        for (int i = 0; i < resource.length; i++) {
            for (int j = i + 1; j < resource.length; j++) {
                if (resource[i] == resource[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
