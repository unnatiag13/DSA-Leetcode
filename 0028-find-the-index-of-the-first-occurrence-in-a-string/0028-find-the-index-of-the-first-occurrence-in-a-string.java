class Solution {
    public int strStr(String haystack, String needle) {
        char[] arr = haystack.toCharArray();
        char[] sub = needle.toCharArray();
        if(arr.length<sub.length) return -1;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==sub[0]){
                 idx=i;
                for(int j=1;j<sub.length;j++){
                    if(i+j>=arr.length){
                        idx=-1;
                        break;
                    }
                    if(arr[i+j] != sub[j]){
                        idx=-1;
                        break;
                    }
                }
                if(idx!=-1) break;
            }
        }
        return idx;
    }
}