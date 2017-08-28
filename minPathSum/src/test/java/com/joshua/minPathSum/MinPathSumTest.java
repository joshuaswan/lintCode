package com.joshua.minPathSum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/28.
 */
public class MinPathSumTest {
    @Test
    public void minPathSum() throws Exception {
        int[][] grid = {{0,1,2},{3,4,5},{6,7,8}};
        System.out.println(grid.length);
        System.out.println(grid[0].length);
        System.out.println(new MinPathSum().minPathSum(grid));
    }

}