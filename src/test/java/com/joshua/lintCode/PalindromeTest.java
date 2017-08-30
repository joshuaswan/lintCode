package com.joshua.lintCode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/22.
 */
public class PalindromeTest {
    @Test
    public void isPalindrome() throws Exception {
        assertThat(new Palindrome().isPalindrome(987654),is(false));
        assertThat(new Palindrome().isPalindrome(11),is(true));
        assertThat(new Palindrome().isPalindrome(9),is(true));

    }

}