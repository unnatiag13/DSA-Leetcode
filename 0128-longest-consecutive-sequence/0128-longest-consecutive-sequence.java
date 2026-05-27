class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int i:nums){
        set.add(i);
       }
       int counter=0,max=0;
       for(int i:set){
        if(!set.contains(i-1)){
            int temp=i;
            counter =1;
            while(set.contains(temp+1)){
                temp++;
                counter++;
            }
        }
        if(counter>max) max=counter;
       }
       return max;
    }
}