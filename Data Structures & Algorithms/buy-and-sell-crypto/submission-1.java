class Solution {
    public int maxProfit(int[] prices) {
        int price=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<price){price=prices[i];
            }
            else{
                int temp=Math.abs(price-prices[i]);
                profit=Math.max(profit,temp);
            }
        }return profit;
    }
}
