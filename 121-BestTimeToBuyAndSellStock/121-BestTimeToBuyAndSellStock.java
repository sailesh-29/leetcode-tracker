// Last updated: 7/9/2026, 10:07:22 AM
class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i:prices){
            if(i<minprice){
                minprice=i;
            }
            if(maxprofit<i-minprice){
                    maxprofit=i-minprice;
                }
            }
        return maxprofit;
    }
}