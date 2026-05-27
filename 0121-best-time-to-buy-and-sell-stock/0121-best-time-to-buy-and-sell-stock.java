class Solution {
    public int maxProfit(int[] prices) {
       int minSoFar = prices[0];
       int maxProfit = 0;
       for(int price :prices){
            if(price<minSoFar) minSoFar = price;
            if(price-minSoFar>maxProfit) maxProfit = price - minSoFar; 
       } 
       return maxProfit;
    }
}