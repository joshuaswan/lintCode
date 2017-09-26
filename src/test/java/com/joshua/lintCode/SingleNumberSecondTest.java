package com.joshua.lintCode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/25.
 */
public class SingleNumberSecondTest {
    @Test
    public void singleNumberII() throws Exception {
        int[] source = {1,1,2,3,3,3,2,2,4,1,5,5,5};
        System.out.println(new SingleNumber().singleNumber(source));
    }

}