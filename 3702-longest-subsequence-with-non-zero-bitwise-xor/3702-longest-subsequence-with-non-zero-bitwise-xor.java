class Solution {
    public int longestSubsequence(int[] nums) {
        int n =nums.length;
        boolean noZero = false;
        int xor=0;
        for(int i:nums){
            xor^=i;
            if(xor!=0) noZero = true;
        }
        if(xor!=0) return n;
        if(noZero) return n-1;
        return 0;

    }
}