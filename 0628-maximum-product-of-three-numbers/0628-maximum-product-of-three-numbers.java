class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE , smax = Integer.MIN_VALUE , tmax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
        for(int i:nums){
            if(i>max){
                tmax= smax;
                smax = max;
                max =i;
            }else if(i>smax){
                tmax= smax;
                smax = i;
            }else if(i>tmax){
                tmax =i;
            }

            if(i<min){
                smin = min;
                min =i;
            }else if(i<smin) smin =i;
        }
        int max1 = max*smax*tmax;
        int max2 = max*min*smin;
        return Math.max(max1,max2);
    }
}