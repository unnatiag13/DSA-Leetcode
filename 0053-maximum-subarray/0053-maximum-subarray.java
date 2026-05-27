class Solution {
    public int maxSubArray(int[] nums) {
       int currentSum = 0;
       int maxSum =nums[0];
       for(int i:nums){
        if(currentSum<0) currentSum = 0;
        currentSum+=i;
        maxSum = Math.max(currentSum,maxSum);
       }
       return maxSum;
    }
}