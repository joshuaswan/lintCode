package com.joshua.findPeak;

/**
 * Created by joshua on 2017/8/24.
 */
public class FindPeak {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        for (int i=1;i<A.length-1;i++){
            if (A[i] > A[i+1] && A[i] >A[i-1]){
                return i;
            }
        }
        return -1;
    }
}
