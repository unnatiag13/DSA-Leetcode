class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();// prefixSum %k,idx
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum= (sum + nums[i]) %k;
            if(sum<0) sum+=k;
            if(map.containsKey(sum)&& Math.abs(map.get(sum)-i)>=2) return true;
            else if(!map.containsKey(sum)) map.put(sum,i);
        }
        // for(int key:map.keySet()){
        //     int n = map.get(key);
        //     if(n>=2) cnt += (n*(n-1))/2;
        // }
        // return cnt;
        return false;
    }
}