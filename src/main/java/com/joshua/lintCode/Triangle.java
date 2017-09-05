package com.joshua.lintCode;

/**
 * Created by joshua on 2017/9/5.
 */
public class Triangle {
    /**
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     * 这个方法需要考虑不同的可能，因为并不是比较下一行，而是要比较所有可能的路径，所以这个解决方案比较二
     */
    public int minimumTotal(int[][] triangle) {
        // write your code here
        int sum = triangle[0][0];
        int flag = 0;
        if (triangle.length == 1) {
            return sum;
        }
        for (int i = 1; i < triangle.length / triangle[0].length; i++) {
            if (triangle[i][flag] < triangle[i][flag + 1]) {
                sum += triangle[i][flag];
            } else {
                sum += triangle[i][flag + 1];
                flag++;
            }
        }
        return sum;
    }
}
