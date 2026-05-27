class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int counter =0;
        int max =0;

        for(int i:set){
            if(!set.contains(i-1)){
                counter =1;
                int temp = i;
                while(set.contains(temp+1)) {
                    counter++;
                    temp++;
                }
            }
            if(counter>max) max = counter;
        } 
        return max;
    }
}