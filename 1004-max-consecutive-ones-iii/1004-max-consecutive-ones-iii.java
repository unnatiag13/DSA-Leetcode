class Solution {
    public int longestOnes(int[] nums, int k) {
        // longest subarray with atmost k zeros
        int maxLen =0,zeros=0;
        int l=0;
        for(int r =0;r<nums.length;r++){
            if(nums[r]==0) zeros++;
            if(zeros>k){
                while(zeros>k && l<r){
                    if(nums[l]==0) zeros--;
                    l++;
                }
            }
            if(zeros<=k) maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;

    }
}