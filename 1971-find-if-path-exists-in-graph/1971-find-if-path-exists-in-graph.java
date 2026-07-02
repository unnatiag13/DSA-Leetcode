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
        return dfs(source,adj,vis,destination);

    }
    static boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis,int des){
        if(node == des) return true;
        vis[node] = true;
        for(int i:adj.get(node)){
            if(!vis[i]){
                if(dfs(i,adj,vis,des)) return true;
            }
        }
        return false;
    }
}