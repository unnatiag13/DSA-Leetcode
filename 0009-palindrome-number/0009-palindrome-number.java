class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x,rev=0;
        while(num!=0){
            rev = num % 10 + rev*10;
            num/=10;
        }
        return x==rev;
    }
}