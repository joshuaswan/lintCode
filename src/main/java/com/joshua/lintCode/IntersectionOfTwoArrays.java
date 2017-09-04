package com.joshua.lintCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshua on 2017/9/4.
 */
public class IntersectionOfTwoArrays {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
        List<Integer> listOne = repeat(nums1);
        List<Integer> listTwo = repeat(nums2);
        List<Integer> results = new ArrayList<Integer>();
        for (int i = 0; i < listOne.size(); i++) {
            for (int j = 0; j < listTwo.size(); j++) {
                if ((int) listOne.get(i) == (int) listTwo.get(j)) {
                    results.add(listOne.get(i));
                }
            }
        }
        int[] ints = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            ints[i] = results.get(i);
        }
        return ints;
    }

    public List<Integer> repeat(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }

//    public int[] intersection(int[] nums1, int[] nums2) {
//        // Write your code here
//
//        List<Integer> results = new ArrayList<Integer>();
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    results.add(nums1[i]);
//                }
//            }
//        }
//        List<Integer> newList = new ArrayList<Integer>();
//
//        for (Integer temp : results) {
//            System.out.printf("");
//            if (!newList.contains(temp)) {
//                newList.add(temp);
//            }
//        }
//        int[] ints = new int[newList.size()];
//        for (int i = 0; i < newList.size(); i++) {
//            ints[i] = newList.get(i);
//        }
//        return ints;
//    }

}
