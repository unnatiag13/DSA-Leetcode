class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = (long) nums[i]*nums[i];
        }
        Arrays.sort(arr);
        long ans =0;
        int k = nums.length/2;

        for(int i=0;i<k;i++){
            ans -= arr[i];
        }
        for(int i=k;i<nums.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}