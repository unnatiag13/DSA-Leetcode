class Solution {
    public int majorityElement(int[] nums) {
        int current = nums[0];
        int count=1;
        int candidate=nums[0];
        for(int i=1;i<nums.length;i++){  
            current = nums[i];
            if(count==0){
                candidate = current;
            }
            if(current==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}