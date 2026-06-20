class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            String n = Integer.toString(num);
            if(n.length()%2==0) count++;
        }
        return count;
    }
}