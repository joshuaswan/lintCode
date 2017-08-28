package com.joshua.partitionArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/28.
 */
public class PartitionArrayTest {
    @Test
    public void partitionArray() throws Exception {
        int[] nums = {2,2,2,2,1,1,1,1};
        new PartitionArray().partitionArray(nums);
        for (int num : nums){
            System.out.print(num);
        }
        System.out.println();
    }

}