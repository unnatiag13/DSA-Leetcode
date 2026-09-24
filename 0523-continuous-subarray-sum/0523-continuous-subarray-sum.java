class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();// prefixSum %k,idx
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum= (sum + nums[i]) %k;
            if(map.containsKey(sum)&& i-map.get(sum)>=2) return true;
            else if(!map.containsKey(sum)) map.put(sum,i);
        }
        return false;
    }
}