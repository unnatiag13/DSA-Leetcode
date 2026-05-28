class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<List<Integer>> bucket=new ArrayList<>();

        for(int i=0;i<n+1;i++){
            bucket.add(null);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int freq = e.getValue();
            if(bucket.get(freq)==null) bucket.set(freq,new ArrayList<>());
            bucket.get(freq).add(e.getKey());
        }

       int[] ans = new int[k];
       int index=0;
        for(int i=n;i>=0 && index<k;i--){
            if(bucket.get(i)!=null){
                for(int q:bucket.get(i)){
                    ans[index++] = q;
                    if(index==k) break;
                }
            }
        }
        return ans;
    }
}