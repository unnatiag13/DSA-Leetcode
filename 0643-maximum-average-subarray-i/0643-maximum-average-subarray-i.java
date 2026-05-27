class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n =nums.length;
        double max =Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=nums[i+j];
            }
            max = Math.max(max,(double)sum/k);
        }
        return max;
    }
}