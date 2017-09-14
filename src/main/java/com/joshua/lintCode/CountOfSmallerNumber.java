package com.joshua.lintCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshua on 2017/9/14.
 */
public class CountOfSmallerNumber {
    /**
     * @param A:       An integer array
     * @param queries: The query list
     * @return: The number of element in the array that are smaller that the given integer
     */
    public List<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<queries.length;i++){
            int count = 0;
            for (int j=0;j<A.length;j++){
                if (A[j] < queries[i]){
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
}
