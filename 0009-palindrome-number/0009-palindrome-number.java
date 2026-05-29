class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s = Integer.toString(x);
        String r="";
        for(int i=s.length() - 1;i>=0;i--){
            r=r+s.charAt(i);
        }
        return s.equals(r);
    }
}