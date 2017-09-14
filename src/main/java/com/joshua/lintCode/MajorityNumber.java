package com.joshua.lintCode;

import java.util.List;

/**
 * Created by joshua on 2017/9/14.
 */
public class MajorityNumber {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int length = nums.size() / 2;

        int count = 0;
        int temp =0;
        int temp1 = 0;
        for (int i=0 ;i<nums.size();i++){
            for (int num:nums){
                if (nums.get(i) == num){
                    count++;
                }
            }
            if (count >= length){
                return nums.get(i);
            }
            if (count > temp){
                temp = count;
                temp1= nums.get(i);
            }
        }

        return temp1;
    }
}
