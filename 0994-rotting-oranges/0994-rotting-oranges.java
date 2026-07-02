class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int time =0;
        int freshCount =0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2) q.offer(new int[]{i,j,0});
                if(grid[i][j]==1) freshCount++;
            }
        }

        while(!q.isEmpty()){
            int row = q.peek()[0];
            int col = q.peek()[1];
            time = q.poll()[2];
            if(row-1>=0 && !vis[row-1][col] &&grid[row-1][col]==1){
                q.offer(new int[]{row-1,col,time+1});
                vis[row-1][col] = true;
                grid[row-1][col]=2;
                freshCount--;
            }
            if(col-1>=0 && !vis[row][col-1] &&grid[row][col-1]==1){
                q.offer(new int[]{row,col-1,time+1});
                vis[row][col-1] = true;
                grid[row][col-1]=2;
                freshCount--;
            }
            if(row+1<grid.length && !vis[row+1][col] &&grid[row+1][col]==1){
                q.offer(new int[]{row+1,col,time+1});
                vis[row+1][col] = true;
                grid[row+1][col]=2;
                freshCount--;
            }
            if(col+1<grid[0].length && !vis[row][col+1] &&grid[row][col+1]==1){
                q.offer(new int[]{row,col+1,time+1});
                vis[row][col+1] = true;
                grid[row][col+1]=2;
                freshCount--;
            }
        }
        if(freshCount==0)
            return time;
        else return -1;
    }
}