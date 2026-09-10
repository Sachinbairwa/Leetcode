class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++){
            int Profit = prices[i]-minPrice;

            maxProfit= Math.max(maxProfit,Profit);
            minPrice= Math.min(minPrice,prices[i]);
        }
        return maxProfit;
    }
}