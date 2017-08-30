package com.joshua.lintCode;

/**
 * Created by joshua on 2017/8/22.
 */
public class Rectangle {
    /**
     * Define two public attributes width and height of type int.
     */
    // write your code here
    private int width;
    private int height;

    /**
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
