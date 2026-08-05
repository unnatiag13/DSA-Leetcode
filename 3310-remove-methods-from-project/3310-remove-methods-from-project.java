class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> rev = new ArrayList<>();
        Set<Integer> allNodes = new HashSet<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            rev.add(new ArrayList<>());
            allNodes.add(i);
        }
        for(int[] edge:invocations ){
            int u = edge[0];
            int v= edge[1];
            adj.get(u).add(v);
            rev.get(v).add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        q.offer(k);
        vis[k] = true;
        Set<Integer> neighbors = new HashSet<>();
        while(!q.isEmpty()){
            int node = q.poll();
            neighbors.add(node);
            for(int i:adj.get(node)){
                if(!vis[i]){
                    q.offer(i);
                    vis[node] = true;
                }
            }
        }

        for(int i:neighbors){
            for(int j:rev.get(i)){
                if(!neighbors.contains(j)){
                    List<Integer> ans = new ArrayList<>();
                    for(int node:allNodes) ans.add(node);
                    return ans;
                }
            }
        }
        allNodes.removeAll(neighbors);
        List<Integer> ans = new ArrayList<>();
        for(int i:allNodes) ans.add(i);
        return ans;
    }
}