package com.joshua.fizzBuzz;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/24.
 */
public class FizzBuzzTest {
    @Test
    public void fizzBuzz() throws Exception {
        List<String> list = new FizzBuzz().fizzBuzz(15);

        for (String string: list){
            System.out.println(string);
        }
    }

}