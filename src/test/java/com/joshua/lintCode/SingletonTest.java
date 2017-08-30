package com.joshua.lintCode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/18.
 */
public class SingletonTest {

    @Test
    public void test() {
        Singleton A = Singleton.getInstance();
        Singleton B = Singleton.getInstance();

        assertThat(A == B, is(true));
    }

}