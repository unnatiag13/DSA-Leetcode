class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc =1,dec=1;
        int maxDec=1,maxInc=1;
        for(int i=0;i<nums.length-1;i++){
            //if(nums[i]==nums[i+1]) continue;
            if(nums[i]<nums[i+1]){
                inc++;
                maxInc = Math.max(inc,maxInc);
            }
            else{ 
                inc =1;
            }
            if(nums[i]>nums[i+1]){ 
                dec++;
                maxDec = Math.max(dec,maxDec);
            }
            else{  
                dec =1;
            }
        }
        return maxInc>=maxDec?maxInc:maxDec;
    }
}