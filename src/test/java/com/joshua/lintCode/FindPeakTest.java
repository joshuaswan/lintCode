package com.joshua.lintCode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/24.
 */
public class FindPeakTest {
    @Test
    public void findPeak() throws Exception {
        int[] source = {1,2,1,2,3,4,5};
        assertThat(new FindPeak().findPeak(source),is(1));
    }

}