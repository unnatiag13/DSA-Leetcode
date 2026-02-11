class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer > freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int n=0;
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if(entry.getValue()==1) n= entry.getKey();
        }
        return n;
    }
}