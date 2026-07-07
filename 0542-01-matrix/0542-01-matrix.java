class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n =mat.length;
        int m = mat[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int[][] distance = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j,0});
                    vis[i][j] = true;
                }
            }
        }
        while(!q.isEmpty()){
            int row = q.peek()[0];
            int col = q.peek()[1];
            int dis = q.poll()[2];
            distance[row][col] = dis;
            
            int[] rowt = {+1,0,-1,0};
            int[] colt = {0,-1,0,+1};
            for(int k=0;k<4;k++){
                int i = rowt[k];
                int j = colt[k];
                if(row+i>=0&&row+i<n && col+j>=0&&col+j<m &&
                !vis[row+i][col+j]){
                    vis[row+i][col+j] = true;
                    q.offer(new int[]{row+i,col+j,dis+1});
                }
            }
            
        }
        
        return distance;
    }
}