package com.joshua.lintCode;

import java.util.Map;

/**
 * Created by joshua on 2017/8/24.
 */
public class StringHomomorphism {
    /**
     * @param s a string
     * @param t a string
     * @return true if the characters in s can be replaced to get t or false
     */
    public boolean isIsomorphic(String s, String t) {
        // Write your code here
        if (s.length() != t.length()) {
            return false;
        }

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        for (int i = 0; i < charS.length; i++) {
            for (int j = i + 1; j < charS.length; j++) {
                if (charS[i] == charS[j] && charT[i] != charT[j]) {
                    return false;
                }
            }
        }
        return true;
    }

//    public boolean answerIsomorphic(String s,String t){
//        if (s.length() != t.length())
//            return false;
//
//        Map<Character,Integer>test = null,comp = null;
//
//        for (int i=0;i<=s.length();i++){
//            test[s.charAt(i)]++;
//            comp[t.charAt(i)]++;
//        }
//        return true;
//    }
}
