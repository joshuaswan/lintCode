package com.joshua.sort.insertion;

/**
 * Created by joshua on 2017/8/21.
 */
public class StraightInsertion {

    /**
     * 插入排序罗辑：从第二个数字开始与前一个进行比较，当后边的数字比前边的数字要小的时候进行插入操作，记录n+1位置上的数字，
     *              将前一个数字和当前位置的数字进行交换，坐标向前移动，循环比较并交换，
     *              当坐标为0或前一个数字比当前记录数字小时，比较完成。
     * @param args
     * @return
     */
    public int[] insertSort(int[] args) {
        int[] result = args;
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i + 1] < result[i]) {
                int x = result[i + 1];
                result[i + 1] = result[i];
                int j = i;
                while (x < result[j]) {
                    result[j + 1] = result[j];
                    result[j] = x;
                    j--;
                    if (j < 0)
                        break;
                }
            }
        }
        return result;
    }
}
