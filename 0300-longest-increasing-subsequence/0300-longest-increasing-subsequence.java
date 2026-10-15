class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int len =1;
        for(int i=1;i<n;i++){
            if(dp[len-1]<nums[i]){
                dp[len] = nums[i];
                len++;
            }else{
                int idx = BinarySearch(dp,0,len-1,nums[i]);
                dp[idx] = nums[i];
            }
        }
        return len;
    }
    public static int BinarySearch(int[] dp,int low,int high,int num){
        int ans =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(dp[mid]>=num){
                ans = mid;
                high = mid-1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}