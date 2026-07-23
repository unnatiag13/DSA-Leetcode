class Pair{
    int v;
    int wt;

    Pair(int _v,int _wt){
        this.v = _v;
        this.wt = _wt;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = makeAdj(times,n);
        int[] dis = new int[n+1];
        for(int i=1;i<=n;i++){
            dis[i] = Integer.MAX_VALUE;
        }
        dis[k] = 0;
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b) -> a.wt-b.wt);
        q.offer(new Pair(k,0));
        while(!q.isEmpty()){
            int u = q.peek().v;
            int dis_u = q.poll().wt;

            for(Pair pair:adj.get(u)){
                int v = pair.v;
                int wt = pair.wt;
                // Edge Relaxation
                if(dis[u]!=Integer.MAX_VALUE && dis[v]> dis[u]+wt){
                    dis[v] = dis[u] + wt;
                    q.offer(new Pair(v,dis[v]));
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1;
            if(dis[i]>max) max = dis[i];
        }
        return max;

    }
    static ArrayList<ArrayList<Pair>> makeAdj(int[][] edges,int V){
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj.get(u).add(new Pair(v,wt));
        }
        return adj;
    }
}