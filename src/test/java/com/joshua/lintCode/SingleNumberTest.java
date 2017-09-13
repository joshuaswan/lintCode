package com.joshua.lintCode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/13.
 */
public class SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        int[] source = {1,1,2,2,3,4,4};
        System.out.println(new SingleNumber().singleNumber(source));
    }

}