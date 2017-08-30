package com.joshua.lintCode.triangleCount;

/**
 * Created by joshua on 2017/8/23.
 */
public class TriangleCount {
    /**
     * @param S: A list of integers
     * @return: An integer
     */
    public int triangleCount(int[] S) {
        // write your code here
        if (S.length < 3){
            return 0;
        }
        int triangleNumber = combination(S.length, 3);
        int[][] results = new int[3][triangleNumber];

        int count = 0;
        for (int i=0;i<triangleNumber;i++){
            if (isTriangle(results[i])){
                count ++;
            }
        }
        return count;
    }

    public int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public int combination(int m, int n) {
        if (m < n) {
            return 0;
        }
        return factorial(m) / factorial(n) / factorial(m - n);
    }

    public boolean isTriangle(int[] edge) {
        if (edge.length != 3) {
            return false;
        }
        return (edge[0] + edge[1] > edge[2] &&
                edge[0] + edge[2] > edge[1] &&
                edge[1] + edge[2] > edge[0]) ? true : false;
    }

}
