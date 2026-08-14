class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen =0;
        int l = 0;
        int[] freq = new int[26];
        freq[s.charAt(l)-'a']++;
        for(int r=1;r<s.length();r++){
            freq[s.charAt(r)-'a']++;
            while(freq[s.charAt(r)-'a']>2){
                freq[s.charAt(l++)-'a']--;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}