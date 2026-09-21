class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren =0 ;
        //int cookieIndex =0;
        int j=0;
        for(int i=0;i<s.length;i++){
            if(j>=g.length) break;
            if(s[i]>=g[j]){
                contentChildren++;
                j++;
            }
        }
        return contentChildren;
    }
}