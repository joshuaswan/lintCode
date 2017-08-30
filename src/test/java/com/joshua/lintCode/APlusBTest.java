package com.joshua.lintCode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/25.
 */
public class APlusBTest {
    @Test
    public void aplusb() throws Exception {
        assertThat(new APlusB().aplusb(3, 4), is(3 + 4));
    }

}