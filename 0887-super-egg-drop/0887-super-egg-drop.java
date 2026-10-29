class Solution {
    public int superEggDrop(int k, int n) {
        int[][] dp = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        } 
        return func(n,k,dp);
    }
    public int func1(int n , int e,int[][] dp){
        if(n==0 || n==1 || e==1){
            return n;
        }
        if(dp[n][e]!=-1) return dp[n][e];
        int ans = Integer.MAX_VALUE;
        for(int f=1;f<=n;f++){
            int b = func1(f-1,e-1,dp);
            int ub = func1(n-f,e,dp);
            int t = Math.max(b,ub)+1;
            ans = Math.min(ans,t);
        }
        return dp[n][e] = ans;
    }
    public int func(int n , int e,int[][] dp){
        if(n==0 || n==1 || e==1){
            return n;
        }
        if(dp[n][e]!=-1) return dp[n][e];
        int ans = Integer.MAX_VALUE;
        //for(int f=1;f<=n;f++){
        int lo=1;
        int hi = n;
        while(lo<=hi){
            int f = (lo+hi)/2;
            int b = func(f-1,e-1,dp);
            int ub = func(n-f,e,dp);
            int t = Math.max(b,ub)+1;
            ans = Math.min(ans,t);
            if(b<ub){
                lo=f+1;
            }else{
                hi=f-1;
            }
        }
        return dp[n][e] = ans;
    }
}