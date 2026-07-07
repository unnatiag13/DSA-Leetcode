class Solution {
    public long sumAndMultiply(int n) {
        if(n<10) return n*n; 
        long ans = 0,sum=0;
        int m =n;
        String s = String.valueOf(n);
        s = s.replace("0","");
        ans = Integer.parseInt(s);
        while(m>0){
            sum += m%10 ;
            m/=10;
        }
        return ans*sum;
    }
}