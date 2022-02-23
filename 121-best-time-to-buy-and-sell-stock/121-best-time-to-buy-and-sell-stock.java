class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0, profit, buy;
        int i=0;
        buy=prices[i];
        while(i<prices.length-1){
            profit=prices[i+1]-buy;
            if(profit>maxProfit){
                maxProfit=profit;
            }
            if(buy>prices[i+1]){
                buy=prices[i+1];
            }
            i++;
        }
        return maxProfit;
    }
}