package com.joshua.lintCode.bestTimeToBuyStock;

/**
 * Created by joshua on 2017/9/14.
 */
public class Third {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if (prices.length <= 1) {
            return 0;
        }
        if (prices.length == 2) {
            return prices[1] - prices[0] > 0 ? prices[1] - prices[0] : 0;
        }
        int result = 0;
        int i = 1;
        int k=1;
        for (; k < prices.length; k++) {
            if (prices[k] < prices[k - 1]) {
                i++;
            }else {
                break;
            }
        }
        for (; i < prices.length; i++) {
            if (prices[i] >= prices[i - 1]) {
                continue;
            } else {
                result += prices[i - 1] - prices[k-1];
                break;
            }
        }
        if (i == prices.length - 1) {
            return result;
        } else if (i == prices.length) {
            i = 0;
        }
        int tempResult = 0;
        for (; i < prices.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    continue;
                }
                if (temp < prices[j] - prices[i]) {
                    temp = prices[j] - prices[i];
                }
            }
            if (tempResult < temp) {
                tempResult += temp;
            }
        }
        return result + tempResult;
    }
}
