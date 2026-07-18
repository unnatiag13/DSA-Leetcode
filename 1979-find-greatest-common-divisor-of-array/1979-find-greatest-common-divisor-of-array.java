class Solution {
    public int findGCD(int[] nums) {
        int b=Integer.MAX_VALUE, a=0;
        for(int i:nums){
            if(i<b) b =i;
            if(i>a) a=i;
        }
        while(b>0){
            int rem = a%b;
            a=b;
            b= rem;
        }
        return a;
    }
}