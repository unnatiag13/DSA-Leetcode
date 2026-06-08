class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = findBound(nums,target,true);
        ans[1] = findBound(nums,target,false);
        return ans;
    }
    public int findBound(int[] nums,int target , boolean isFirst){
        int start = 0;
        int end = nums.length-1;
        int bound =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                bound = mid;
                if(isFirst) end =mid -1;
                else start = mid +1;
            }
            else if(nums[mid]<target) start= mid+1;
            else end = mid-1;
        }
        return bound;
    } 
}