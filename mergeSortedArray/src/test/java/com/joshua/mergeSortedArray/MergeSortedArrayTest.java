package com.joshua.mergeSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/21.
 */
public class MergeSortedArrayTest {
    @Test
    public void mergeSortedArray() throws Exception {
        int[] A = {1,2,3};
        int[] B = {2,2,4};
        new MergeSortedArray().mergeSortedArray(B,A);
    }

}