class Solution {
    public int removeDuplicates(int[] nums) {
        int a=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[a-2]){
                nums[a++]=nums[i];
            }
        }
        return a;
    }
}