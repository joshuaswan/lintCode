package com.joshua.lintCode;

import org.junit.Test;

/**
 * Created by joshua on 2017/8/28.
 */
public class AddBinaryTest {
    @Test
    public void full() throws Exception {
        char[] source = {'1','0'};
        System.out.println(new AddBinary().full(source,4));
    }

    @Test
    public void addBinary() throws Exception {
        System.out.println(new AddBinary().addBinary("0","0"));
    }

}