class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:invocations ){
            int u = edge[0];
            int v= edge[1];
            adj.get(u).add(v);
        }
        boolean[] vis = new boolean[n];
        vis[k] = true;
        for(int i:adj.get(k)){
            if(!vis[i]){
                dfs(i,adj,vis);
            }
        }
        for(int[] edge:invocations){
            int u= edge[0];
            int v  = edge[1];
            if(vis[u]==false && vis[v]==true){
                List<Integer> ans = new ArrayList<>(); 
                for(int i=0;i<n;i++) ans.add(i);
                return ans;
            }
        }
        List<Integer> ans = new ArrayList<>(); 
        for(int i=0;i<n;i++){ 
            if(!vis[i]) ans.add(i);
        }
        return ans;
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