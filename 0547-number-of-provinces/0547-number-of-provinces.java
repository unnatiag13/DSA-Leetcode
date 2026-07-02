class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans = 0;
        boolean[] vis = new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                dfs(i,vis,isConnected);
                ans++;
            }
        }
        return ans;
    }
    static void dfs(int node , boolean[] vis,int[][] isConnected){
        vis[node] = true;
        for(int i=0;i<isConnected[node].length;i++){
            if(!vis[i] && isConnected[node][i]==1)
                dfs(i,vis,isConnected);
        }
    }
}