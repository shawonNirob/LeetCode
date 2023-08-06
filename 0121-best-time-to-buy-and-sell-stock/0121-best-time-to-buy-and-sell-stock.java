class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        int stock = Integer.MAX_VALUE;
        for(int i=0;  i<prices.length; i++){
            if(stock > prices[i]){
                stock = prices[i];
            }else if(prices[i]-stock > profit){
                profit = prices[i]-stock;
            }
        }
        return profit;
    }
}