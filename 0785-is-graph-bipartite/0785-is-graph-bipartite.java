class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        // two groups - 1 and 2
        for(int i=0;i<graph.length;i++){
            if(color[i]==0){
                if (dfs(i,graph,color,1)==false) return false;
            }
        }
        return true;
    }
    static boolean dfs(int i,int[][] graph,int[] color,int iColor){
        color[i] = iColor;
        for(int node:graph[i]){
            if(color[node]==0){
                int nodeColor = iColor==1?2:1;
                if (dfs(node,graph,color,nodeColor)==false) return false;
            }
            else if(iColor==color[node]){
                return false;
            }
        }
        return true;
    }
}