class Solution {
    public static int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int profitMax = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                profitMax = Math.max(profitMax, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return profitMax;
    }
}