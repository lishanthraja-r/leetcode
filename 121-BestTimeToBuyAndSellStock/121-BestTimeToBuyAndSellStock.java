// Last updated: 7/17/2026, 3:08:58 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            profit = Math.max(profit, price - minPrice);
        }
         return profit;
    }
}