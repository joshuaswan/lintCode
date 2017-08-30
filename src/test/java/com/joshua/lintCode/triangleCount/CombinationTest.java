package com.joshua.lintCode.triangleCount;

import org.junit.Test;

/**
 * Created by joshua on 2017/8/23.
 */
public class CombinationTest {
    @Test
    public void recursionCombine() throws Exception {
        Combination combination = new Combination();
        int[] source = {1,2,3,4,5,6};
        int[] result = new int[3];
        combination.recursionCombine(source,0,result,3,3);
        System.out.println();
        for (int i:result){
            System.out.print(i);
        }
        System.out.println();
    }

}