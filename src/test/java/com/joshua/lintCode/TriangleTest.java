package com.joshua.lintCode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/5.
 */
public class TriangleTest {
    @Test
    public void minimumTotal() throws Exception {
        int[][] resource = {{1},{2,3},{3,4,5},{4,1,2,3}};
        System.out.println(new Triangle().minimumTotal(resource));
        int[][] resource1 = {{-1},{2,3},{1,-1,-3}};
        System.out.println(new Triangle().minimumTotal(resource1));
    }

}