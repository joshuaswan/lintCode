package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/28.
 */
public class MinPathSum {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        int result = grid[0][0];
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                result += grid[i][j];
            }
        }
        return result;

    }
}
