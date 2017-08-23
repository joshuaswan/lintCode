package com.joshua.triangleCount;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/23.
 */
public class TriangleCountTest {
    @Test
    public void triangleCount() throws Exception {
        int[] arr = {3,4,5,6,7};
        System.out.println(new TriangleCount().triangleCount(arr));
    }

}