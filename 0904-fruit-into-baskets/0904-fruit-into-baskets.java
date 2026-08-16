class Solution {
    public int totalFruit(int[] fruits) {
        // max length subarray with at most 2 types of fruits
        Map<Integer,Integer> map = new HashMap<>();
        int l=0;
        int maxLen = 0;
        for(int r =0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2 && l<r){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0) map.remove(fruits[l]);
                l++;
            }
            maxLen = Math.max(r-l+1,maxLen);
        }
        return maxLen;
    }
}