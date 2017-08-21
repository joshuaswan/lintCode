package com.joshua.anagram;

import java.util.Arrays;

/**
 * Created by joshua on 2017/8/21.
 */
public class Anagram {


    public boolean anagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        if (!changeOrder(s).equals(changeOrder(t))){
            return false;
        }
        return true;
    }

    public String changeOrder(String args) {
        char[] resource = args.toCharArray();
        Arrays.sort(resource);
        return String.valueOf(resource);
    }
}
