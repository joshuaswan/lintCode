package com.joshua.countAndSay;

/**
 * Created by joshua on 2017/8/28.
 */
public class CountAndSay {

    /**
     * @param n: the nth
     * @return: the nth sequence
     */
    public String countAndSay(int n) {
        // write your code here
        if (n == 1) {
            return "1";
        }
        String temp = "11";
        for (int i = 2; i < n; i++) {
            temp = count(temp);
        }
        return temp;
    }

    public String count(String string) {
        char[] sep = string.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < sep.length; i++) {
            int count = 1;
            int j = i;
            for (; j + 1 < sep.length; j++) {
                if (sep[j] == sep[j + 1]) {
                    count++;
                } else {
                    break;
                }
            }
            stringBuffer.append(count);
            stringBuffer.append(sep[i]);
            i = j;
        }
        return stringBuffer.toString();
    }
}
