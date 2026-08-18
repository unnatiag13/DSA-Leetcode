class Solution {
    public int largestInteger(int[] nums, int k) {
        int n =nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i:nums) freq.put(i,freq.getOrDefault(i,0)+1);
        int max=-1;
        if(k==1){
             for (Map.Entry<Integer, Integer> map : freq.entrySet()) {
                if (map.getValue() == 1 && map.getKey()>max) {
                    max = map.getKey();
                }
             }
             return max;
        }
        if(k==n){
            for(int i:nums){
                max = Math.max(i,max);
            }
            return max;
        }
        if(freq.get(nums[0])==1 && freq.get(nums[n-1])==1) 
            return Math.max(nums[0],nums[n-1]);
        else if(freq.get(nums[0])!=1 && freq.get(nums[n-1])==1) return nums[n-1];
        else if(freq.get(nums[n-1])!=1&& freq.get(nums[0])==1) return nums[0];
        else return -1;
        
    }
}