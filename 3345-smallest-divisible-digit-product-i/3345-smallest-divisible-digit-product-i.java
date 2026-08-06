class Solution {
    static int productOfDigits(int n ){
        int ans = 1;
        while(n>0){
            ans*=n%10;
            n/=10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            int product = productOfDigits(n);
            if(product%t==0) return n;
            n++;
        }
    }
}