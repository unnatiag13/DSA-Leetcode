class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        x=Math.abs(x);
        String s = Integer.toString(x);
        int st =  0, end =s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }
}