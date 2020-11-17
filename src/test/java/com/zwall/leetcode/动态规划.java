package com.zwall.leetcode;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-11 22:34
 **/
public class 动态规划 {
    // 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
    // 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
    // 注意：你不能在买入股票前卖出股票。

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= minPrice) {
                minPrice = prices[i];
            } else {
                int tmp = prices[i] - minPrice;
                if (tmp > maxProfit) {
                    maxProfit = tmp;
                }
            }
        }
        return maxProfit;
    }
}
