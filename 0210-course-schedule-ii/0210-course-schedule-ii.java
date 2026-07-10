class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] courses : prerequisites){
            int u=courses[1], v =courses[0];
            adj.get(u).add(v);
        }

        int[] indeg = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int j:adj.get(i)){
                indeg[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0) q.offer(i);
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            for(int i:adj.get(node)){
                indeg[i]--;
                if(indeg[i]==0){
                    q.offer(i);
                }
            }
        }
        if(topo.size()<numCourses) return new int[]{};
        int[] ans = topo.stream().mapToInt(i -> i).toArray();

        return ans;
    }
}