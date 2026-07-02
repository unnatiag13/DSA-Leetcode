class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        boolean[] vis = new boolean[n];
        dfs(source,adj,vis);
        if(vis[destination]==true) return true;
        return false;
    }
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[node] = true;
        for(int i:adj.get(node)){
            if(!vis[i]){
                dfs(i,adj,vis);
            }
        }
    }
}