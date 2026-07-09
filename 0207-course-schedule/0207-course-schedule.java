class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = MakeAdjFromEdgeMat(prerequisites,numCourses);
        int V =numCourses;
        int[] indeg = new int[V]; 
        Queue<Integer> q = new LinkedList<>();
        int cnt=0;
        for(ArrayList<Integer> u:adj){
            for(int v:u){
                indeg[v]++;
            }
        }
        for(int i=0;i<V;i++){
            if(indeg[i]==0) q.offer(i);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            cnt++;
            for(int i:adj.get(node)){
                indeg[i]--;
                if(indeg[i]==0) q.offer(i);
            }
        }
        
        
        if(cnt==V) return true;
        return false;
    }
    static ArrayList<ArrayList<Integer>> MakeAdjFromEdgeMat(int[][] edges,int V){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        return adj;
    }
}