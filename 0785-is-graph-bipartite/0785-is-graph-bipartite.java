class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] vis = new int[graph.length];
        // two groups - 1 and 2
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0){
                if (bfs(i,graph,vis)) return false;
            }
        }
        return true;
    }
    static boolean bfs(int i,int[][] graph,int[] vis){
        Queue<int[]> q = new LinkedList<>(); // pos , color
        q.offer(new int[]{i,1});
        vis[i] = 1;
         while(!q.isEmpty()){
            int parentNode = q.peek()[0];
            int parentGroup = q.poll()[1];
            for(int node: graph[parentNode]){
                int NodeGroup = parentGroup==1?2:1;
                if(vis[node]==0){
                    q.offer(new int[]{node,NodeGroup});
                    vis[node] = NodeGroup;
                }else if(vis[node]==parentGroup){
                    return true;
                }
            }
        }
        return false;
    }
}