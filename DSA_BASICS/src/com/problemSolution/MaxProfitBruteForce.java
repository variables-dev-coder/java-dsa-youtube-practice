package com.problemSolution;

public class MaxProfitBruteForce {

    public static int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // Test Case 1: Prices increasing
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit for [7,1,5,3,6,4]: " + maxProfitBruteForce(prices1)); // Expected: 5

        // Test Case 2: Prices decreasing
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit for [7,6,4,3,1]: " + maxProfitBruteForce(prices2)); // Expected: 0

        // Test Case 3: No profit possible (all prices same)
        int[] prices3 = {3, 3, 3, 3, 3};
        System.out.println("Max Profit for [3,3,3,3,3]: " + maxProfitBruteForce(prices3)); // Expected: 0

        // Test Case 4: Single price (no transactions possible)
        int[] prices4 = {5};
        System.out.println("Max Profit for [5]: " + maxProfitBruteForce(prices4)); // Expected: 0

    }
}
