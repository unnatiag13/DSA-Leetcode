class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       HashMap<Character,Integer> map = new HashMap<>();
       int l=0;
       int maxLen = 0;
       for(int r=0;r<n;r++){
        char ch = s.charAt(r);
        if(map.containsKey(ch)){
            l = Math.max(l,map.get(ch)+1);
        }
        map.put(ch,r);
        maxLen = Math.max(maxLen,r-l+1);
       }
       return maxLen;
    }
}