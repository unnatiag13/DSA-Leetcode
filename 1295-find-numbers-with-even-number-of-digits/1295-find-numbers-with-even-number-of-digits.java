class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)%2==0) count++;
        }
        return count;
    }
    public static int even(int num){
        return (int) Math.log10(num)+1; 
    }
}