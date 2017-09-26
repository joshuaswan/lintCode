package com.joshua.lintCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshua on 2017/9/5.
 */
public class SingleNumberSecond {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumberII(int[] A) {
        // write your code here
        int result = 0;
        List resultList = new ArrayList();
        for (int i=0;i<A.length;i++){
            int count = 0;
            for (int j=i;j<A.length;j++){
                if (resultList.contains(j)){
                    continue;
                }
                if (A[i] == A[j]){
                    count ++;
                    resultList.add(j);
                }
            }
            if (count ==1 ){
                return A[i];
            }
        }
        return result;
    }
}
