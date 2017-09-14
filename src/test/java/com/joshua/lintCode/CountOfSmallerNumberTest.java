package com.joshua.lintCode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/14.
 */
public class CountOfSmallerNumberTest {
    @Test
    public void countOfSmallerNumber() throws Exception {
        int[] A = {1,2,3,4,5,6};
        int[] queries = {1,2,3,4};
        System.out.println(new CountOfSmallerNumber().countOfSmallerNumber(A,queries));
    }

}