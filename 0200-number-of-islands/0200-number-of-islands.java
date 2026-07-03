class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        // boolean[][] vis = new boolean[n][m];
        int islands=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' ){
                    // vis[i][j] = true;
                    bfs(i,j,grid);
                    islands++;
                }
            }
        }
        return islands;
        
    }
    static void bfs(int r,int c,char[][] grid){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r,c});
        int n = grid.length;
        int m = grid[0].length;

        int[] rowt = {+1,0,-1,0};
        int[] colt = {0,+1,0,-1};
        while(!q.isEmpty()){
            int row=q.peek()[0];
            int col=q.poll()[1];
            for(int k=0;k<4;k++){
                int i=rowt[k];
                int j =colt[k];
                if(row+i>=0&&row+i<n &&col+j>=0&&col+j<m && grid[row+i][col+j]=='1'){
                    // vis[row+i][col+j] = true;
                    grid[row+i][col+j] = '0';
                    q.offer(new int[]{row+i,col+j});
                }
            }
        }
    }
}