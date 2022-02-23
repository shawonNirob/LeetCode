class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0, minPrice=Integer.MAX_VALUE;
        int i=0;
        while(i<prices.length){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(prices[i]-minPrice > maxProfit){
                maxProfit=prices[i]-minPrice;
            }
            i++;
        }
        return maxProfit;
    }
}