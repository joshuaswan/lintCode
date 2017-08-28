package com.joshua.countOnes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/28.
 */
public class CountOnesTest {
    @Test
    public void countOnes() throws Exception {
        System.out.println(new CountOnes().countOnes(2147483647));
    }

}