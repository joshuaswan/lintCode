package com.joshua.lintCode.sort.insertion;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/21.
 */
public class StraightInsertionTest {
    @Test
    public void insertSort() throws Exception {
        int[] A = {3, 1, 5, 7, 2, 4, 9, 6};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 9};
        assertThat(new StraightInsertion().insertSort(A), is(result));
    }

}