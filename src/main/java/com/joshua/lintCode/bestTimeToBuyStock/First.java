package com.joshua.lintCode.bestTimeToBuyStock;

/**
 * Created by joshua on 2017/9/14.
 */
public class First {
    /**
 * @param prices: Given an integer array
 * @return: Maximum profit
 */
    public int maxProfit(int[] prices) {
        // write your code here
        if (prices.length <= 1){
            return 0;
        }
        int result = 0;
        for (int i=0;i<prices.length;i++){
            int temp = 0;
            for (int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    continue;
                }
                if (temp < prices[j] - prices[i]){
                    temp = prices[j] - prices[i];
                }
            }
            if (result < temp){
                result = temp;
            }
        }
        return result;
    }
}
