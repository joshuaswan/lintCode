package com.joshua.fibonacci;

/**
 * Created by joshua on 2017/8/24.
 */
public class Fibonacci {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        int[] list = new int[n];
        list[0] = 0;
        list[1] = 1;
        if (n==1){
            return 0;
        }else if (n==2){
            return 1;
        }else {
            for (int i=2;i<n;i++){
                list[i] = list[i-1] + list[i-2];
            }
        }
        return list[n-1];
    }
}
