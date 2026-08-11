class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int sum =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                sum+= nums[i];
            }
            else {
                break;
            }
        }
        for(int i :nums) set.add(i);
        while(set.contains(sum)){
            sum++;
        }
        return sum;
        
    }
}