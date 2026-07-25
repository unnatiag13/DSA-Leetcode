class Solution {
    public int maxProduct(int n) {
        int max =0 ;
        int smax =0;
        int m = n;
        while(m>0){
            int digit = m%10;
            if(digit>max){
                smax = max;
                max = digit;
            }
            else if(digit >smax){
                smax = digit;
            }
            m/=10;
        }
        return max*smax;

    }
}