class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans ="";
        int n=0;
        if(word1.length()<=word2.length()){
            n=word1.length();
        }else{
            n= word2.length();
        }
        for(int i=0;i<n;i++){
            ans+=word1.charAt(i);
            ans+=word2.charAt(i);
        }
        if(n==word1.length()){
            for(int i=n;i<word2.length();i++){
            ans+=word2.charAt(i);
            }
        }
        else if(n==word2.length()){
            for(int i=n;i<word1.length();i++){
            ans+=word1.charAt(i);
            }
        }
    return ans;
    }
}