package com.joshua.lintCode.toyFactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/13.
 */
public class ToyFactoryTest {
    @Test
    public void getToy() throws Exception {
        ToyFactory tf = new ToyFactory();
        Toy toy = tf.getToy("Test");
        toy.talk();
    }

}