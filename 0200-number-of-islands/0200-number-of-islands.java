class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int islands =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    dfs(i,j,vis,grid);
                    islands++;
                }
            }
        }
        return islands;
        
    }
    static void dfs(int row, int col, boolean[][] vis,char[][] grid){
        vis[row][col] = true;

        int[] rowt = {1,0,-1,0};
        int[] colt = {0,1,0,-1};
        for(int i=0;i<4;i++){
            int j = row + rowt[i];
            int k = col + colt[i];

            if(j<grid.length && j>=0 && k<grid[0].length && k>=0){
                if(!vis[j][k] && grid[j][k]=='1')
                    dfs(j,k,vis,grid);
            }
        }
    }
}