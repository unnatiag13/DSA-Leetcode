class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            int maxKey = -1;
            int maxFreq = -1;
            for(int key:map.keySet()){
                if(map.get(key)>maxFreq){
                    maxFreq = map.get(key);
                    maxKey = key;
                }
            }
            ans[i] = maxKey;
            map.remove(maxKey);
        }   
        return ans;
    }
}