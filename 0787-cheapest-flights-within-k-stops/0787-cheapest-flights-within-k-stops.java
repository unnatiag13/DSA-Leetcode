class Pair{
    int v;
    int wt;

    Pair(int _v,int _wt){
        this.v = _v;
        this.wt = _wt;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] flight:flights){
            int u = flight[0], v = flight[1] , wt = flight[2];
            adj.get(u).add(new Pair(v,wt));
        }

        int dis[] = new int[n];
        for(int i=0;i<n;i++){
            dis[i] = Integer.MAX_VALUE;
        }
        dis[src]=0;
        Queue<int[]> q = new LinkedList<>();
        // int[] - stops,node,dis
        q.offer(new int[]{0,src,0});
        while(!q.isEmpty()){
            int node = q.peek()[1];
            int stops = q.peek()[0];
            int cost = q.poll()[2];

            if(node ==dst) continue;

            for(Pair pair:adj.get(node)){
                int v = pair.v;
                int wt = pair.wt;

                if(stops<=k && dis[v]>cost+wt){
                    dis[v] = cost+wt;
                    q.offer(new int[]{stops+1,v,dis[v]});
                }
            }
        }

        return dis[dst] == Integer.MAX_VALUE?-1:dis[dst];

    }
}