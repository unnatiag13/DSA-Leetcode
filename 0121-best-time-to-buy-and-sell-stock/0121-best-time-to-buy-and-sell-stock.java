class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<min) min = prices[i];
            if(prices[i]-min>max) max = prices[i]-min;
        }
        return max;
    }
}