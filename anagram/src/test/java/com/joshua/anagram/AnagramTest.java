package com.joshua.anagram;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/21.
 */
public class AnagramTest {
    @Test
    public void anagram() throws Exception {
        assertThat(new Anagram().anagram("1234","4321"),is(true));
        assertThat(new Anagram().anagram("1234","4221"),is(false));
    }

    @Test
    public void changeOrder() throws Exception {
        assertThat(new Anagram().changeOrder("364735"),is("334567"));
    }

}