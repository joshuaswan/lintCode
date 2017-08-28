package com.joshua.partitionArray;

/**
 * Created by joshua on 2017/8/28.
 */
public class PartitionArray {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        for (int i=0;i<nums.length;i++){
            if (nums[i] % 2 == 0){
                for (int j=i+1;j<nums.length;j++){
                    if (nums[j] % 2 == 1){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }else {
                continue;
            }
        }
    }
}
