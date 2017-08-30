package com.joshua.lintCode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/25.
 */
public class TrailingZerosTest {
    @Test
    public void trailingZeros() throws Exception {
        assertThat(new TrailingZeros().trailingZeros(123),is(28L));
        assertThat(new TrailingZeros().trailingZeros(0),is(0L));
        assertThat(new TrailingZeros().trailingZeros(4),is(0L));
    }

}