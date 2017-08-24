package com.joshua.twoSum;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/24.
 */
public class TwoSumTest {
    @Test
    public void twoSum() throws Exception {
        int[] numbers = {1,2,3,4,5,6,7};
        int[] result = {3,7};
        assertThat(new TwoSum().twoSum(numbers,10),is(result));
    }

}