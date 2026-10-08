class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return hrob(nums,0,dp);
    }
    public static int hrob(int[] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int a  =nums[i] + hrob(nums,i+2,dp);
        int b = hrob(nums,i+1,dp);
        return dp[i]= Math.max(a,b);
    }  
}