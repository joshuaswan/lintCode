package com.joshua.longestPalindrome;

/**
 * Created by joshua on 2017/8/22.
 */
public class LongestPalindrome {
    /**
     * @param s a string which consists of lowercase or uppercase letters
     * @return the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        // Write your code here
        if (s.length() == 0){
            return 0;
        }
        String result = s;
        int length = result.length();
        int[] numberOfLetter = new int[length];
        int station = 0;
        for (int i=0;i<length;){
            for (int j=0;j<length;j++){
                if (result.charAt(0) == result.charAt(j)){
                    numberOfLetter[station]++;
                }
            }
            station ++;
            result = result.replaceAll(String.valueOf(result.charAt(0)),"");
            length = result.length();
        }

        int numberOfPalindrome = 0;
        boolean odd = false;
        for (int i=0;i<station;i++){
            if ((numberOfLetter[i] %2) ==1){
                numberOfPalindrome += (numberOfLetter[i]-1);
                odd = true;
            }else {
                numberOfPalindrome += numberOfLetter[i];
            }
        }
        return odd?numberOfPalindrome + 1:numberOfPalindrome;
    }
}
