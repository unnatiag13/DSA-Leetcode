class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs[0].length(); // 3
        for(int i=1;i<strs.length;i++){ // 1 2 
            String first = strs[i-1];
            String second = strs[i];
            int cnt =0;

            for(int j=0;j<second.length() && first.length()>j;j++){
                if(first.charAt(j)!=second.charAt(j)) break;
                else cnt++;
            }
            len = Math.min(len,cnt);
            if(len==0) return "";
        }
        return new String(strs[0].substring(0,len));
    }
}