class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }
        return explore(0,0,m,n,dp);
    }
    public static int explore(int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>m-1 || j>n-1){
            return 0 ;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int a1 = explore(i,j+1,m,n,dp);
        int a2 = explore(i+1,j,m,n,dp); 
        return dp[i][j]= a1+a2;
    }
}