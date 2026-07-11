class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0] , v= edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[adj.size()];
        int cnt=0;

        for(int i=0;i<adj.size();i++){  
            if(!vis[i]){
                int[] ev = new int[2];
                dfs(i,vis,adj,ev);
                if(ev[0]/2==ev[1]*(ev[1]-1)/2)
                    cnt++;
            }
        }
        return cnt;
    }

    // 0 -> 
    // e - 2
    // v - 3
    static void dfs(int node,boolean[] vis, ArrayList<ArrayList<Integer>> adj,int[] ev){
        ev[1]++;
        vis[node] = true;
        for(int i:adj.get(node)){
            ev[0]++;
            if(!vis[i]){
                dfs(i,vis,adj,ev);
            }
        }
    }
}
