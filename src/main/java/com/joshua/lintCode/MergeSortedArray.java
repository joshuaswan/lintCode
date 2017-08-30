package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/21.
 */
public class MergeSortedArray {

    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     **/
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int orderA = 0;
        int orderB = 0;
        int[] result = new int[A.length + B.length];
        for (int i = 0; i < A.length + B.length; i++) {
            if (A[orderA] >= B[orderB]) {
                result[i] = B[orderB];
                orderB++;
            }else {
                result[i] = A[orderA];
                orderA++;
            }
            if (orderA >= A.length){
                for (i++;i< A.length + B.length ; i++){
                    result[i] = B[orderB];
                    orderB++;
                }
                break;
            }else if (orderB >= B.length){
                for (i++; i < A.length + B.length; i++) {
                    result[i] = A[orderA];
                    orderA++;
                }
                break;
            }
        }
        return result;
    }
}
