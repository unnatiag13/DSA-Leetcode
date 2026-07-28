class Solution {
    public String smallestPalindrome(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        Arrays.sort(chars,0,len/2);
        for(int i=0;i<len/2;i++){
            chars[len-1-i] = chars[i];
        }
        return new String(chars);
    }
}