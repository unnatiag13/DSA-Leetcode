class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return LCS(s1,s2,s1.length()-1,s2.length()-1,dp);
    }
    public static int LCS(String s1,String s2, int idx1,int idx2,int[][] dp){
        if(idx1<0 || idx2<0){
            return 0;
        }
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return dp[idx1][idx2] =  1 + LCS(s1,s2,idx1-1,idx2-1,dp);
        }else{
            return dp[idx1][idx2] = Math.max(
                LCS(s1,s2,idx1-1,idx2,dp),
                LCS(s1,s2,idx1,idx2-1,dp)
            );
        }
    }
}