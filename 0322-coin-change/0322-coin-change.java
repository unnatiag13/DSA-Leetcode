class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = comb(coins,amount,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public static int comb(int[] coins,int amount,int[] dp){
        if(amount==0){
            return 0;
        }if(dp[amount]!=-1) return dp[amount];
        int min =Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                int c = comb(coins,amount-coins[i],dp);
                if(c!=Integer.MAX_VALUE){
                    min = Math.min(1+c,min);
                }
            }
        }
        return dp[amount] =  min;
    }
}