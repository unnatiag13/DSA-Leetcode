class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = arr[i]^prefix[i-1];
        } 
        int[] ans = new int[queries.length];
        int k=0;
        for(int[] query:queries){
            if(query[0]==0) ans [k++] = prefix[query[1]];
            else ans[k++] = prefix[query[1]] ^ prefix[query[0]-1];
        }
        return ans;
    }
}