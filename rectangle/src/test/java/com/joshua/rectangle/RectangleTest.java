package com.joshua.rectangle;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/22.
 */
public class RectangleTest {
    @Test
    public void getArea() throws Exception {
        Rectangle rectangle = new Rectangle(3,4);
        assertThat(rectangle.getArea(),is(12));
    }

}