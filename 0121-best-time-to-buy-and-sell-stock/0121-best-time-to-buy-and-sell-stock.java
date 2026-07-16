class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int profit = 0;
        int buy = 0;
        int sell = 1;
        while(sell < prices.length){
            if(prices[buy] > prices[sell]){
                buy = sell;
            }
            else if(prices[buy] < prices[sell]){
                profit = prices[sell] - prices[buy];
                max_profit = Math.max(profit , max_profit);

            }
            sell++;
        }
        return max_profit;   
    }
}