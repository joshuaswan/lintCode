package com.joshua.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/24.
 */
public class FibonacciTest {
    @Test
    public void fibonacci() throws Exception {
        System.out.println(new Fibonacci().fibonacci(41));
    }

}