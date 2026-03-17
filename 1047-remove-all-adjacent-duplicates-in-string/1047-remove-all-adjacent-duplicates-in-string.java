class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(ans.length()!=0 && s.charAt(i)==ans.charAt(ans.length()-1)){
                ans.deleteCharAt(ans.length()-1);
            }
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}