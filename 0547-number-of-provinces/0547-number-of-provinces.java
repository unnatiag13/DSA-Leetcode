class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int cnt=0;

        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,isConnected);
                cnt++; 
            }  
        }
        return cnt;
    }
    static void dfs(int node,boolean[] vis ,int[][] isConnected ){
        vis[node] = true;
        for(int i=0;i<isConnected.length;i++){
            if( !vis[i] && isConnected[node][i]==1){
                dfs(i,vis,isConnected);
            }
        }
    }
   
}