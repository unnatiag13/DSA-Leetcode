class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       int n = nums.length;
       int count=0,maxLen=0;
       for(int i:nums) set.add(i);
       for(int i:set){
        if(!set.contains(i-1)){
            count=1;
            int temp=i;
            while(set.contains(temp+1)){
                count++;
                temp++;
            }
            if(count>maxLen) maxLen = count;
        }
       }
       return maxLen;
    }
}