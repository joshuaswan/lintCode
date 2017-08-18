package com.joshua.singleton;

/**
 * Created by joshua on 2017/8/18.
 */
public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }
}
